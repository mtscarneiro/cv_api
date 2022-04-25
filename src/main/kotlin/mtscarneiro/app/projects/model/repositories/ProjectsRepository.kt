package mtscarneiro.app.projects.model.repositories

import mtscarneiro.app.projects.model.entities.Projects
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProjectsRepository : JpaRepository<Projects, Int>