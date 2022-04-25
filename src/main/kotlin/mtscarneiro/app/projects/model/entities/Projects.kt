package mtscarneiro.app.projects.model.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Projects(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Int,
    internal val url: String,
    internal val imageLink: String,
    val title: String,
    val description: String
) {
    override fun toString(): String {
        return "Projects(id=$id, url='$url', imageLink='$imageLink', title='$title', description='$description')"
    }

}