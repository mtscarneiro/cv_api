package mtscarneiro.app.projects.controllers

import mtscarneiro.app.projects.model.entities.Projects
import mtscarneiro.app.projects.services.ProjectsService
import mtscarneiro.app.projects.services.response.PostResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import java.net.URI

@RestController
@RequestMapping("/api/projects")
class ProjectController(
    private val service: ProjectsService
) {

    @GetMapping
    fun getAll(): ResponseEntity<List<Projects>> {
        val allProjects = service.getAllProjects()

        return ResponseEntity.ok().body(allProjects)
    }

    @GetMapping("/{id}")
    fun getOneProject(@PathVariable id: Int): ResponseEntity<Projects> {
        val project = service.getProjectByItsID(id)

        return ResponseEntity.ok().body(project)
    }

    @PostMapping("/insert")
    fun insertAProject(projects: Projects): ResponseEntity<PostResponse> {
        val response = service.insertAProject(projects)

        val uri: URI = ServletUriComponentsBuilder
            .fromCurrentRequest().path("/{id}")
            .buildAndExpand(projects.getId()).toUri()

        return ResponseEntity.created(uri).body(response)
    }
}