package mtscarneiro.app.projects.controllers

import mtscarneiro.app.projects.model.entities.Projects
import mtscarneiro.app.projects.services.ProjectsService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

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
}