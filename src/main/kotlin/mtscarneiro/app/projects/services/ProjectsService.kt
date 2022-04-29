package mtscarneiro.app.projects.services

import mtscarneiro.app.projects.model.entities.Projects
import mtscarneiro.app.projects.model.repositories.ProjectsRepository
import mtscarneiro.app.projects.services.response.PostResponse
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProjectsService(
    private val projectsRepository: ProjectsRepository
) {

    fun getAllProjects(): List<Projects> {
        return projectsRepository.findAll()
    }

    fun getProjectByItsID(id: Int): Projects {
        return projectsRepository.getById(id)
    }

    fun insertAProject(projects: Projects): PostResponse {
        return if(projects.url == "") {
            projectsRepository.save(projects)

            PostResponse(UUID.randomUUID().toString(), "Created Succesfully")
        } else {
            PostResponse("no id", "Project not created")
        }
    }
}