import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse

annotation class DefaultErrors(
    val value: Array<ApiResponse> = [
        ApiResponse(
            responseCode = "422", description = "Business exception",
            content = [
                Content(mediaType = "application/json", schema = Schema(implementation = ExceptionResponse::class))
            ]
        ),
    ]
)


data class ExceptionResponse(
    val code: String
)