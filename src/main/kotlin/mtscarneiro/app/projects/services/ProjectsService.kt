package mtscarneiro.app.projects.services

import mtscarneiro.app.projects.model.entities.Projects
import mtscarneiro.app.projects.model.repositories.ProjectsRepository
import org.springframework.stereotype.Service

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
}