package mtscarneiro.app.projects.services.response

data class PostResponse(
    private val id: String,
    private val description: String

) {
    override fun toString(): String {
        return "PostResponse(id='$id', description='$description')"
    }
}
