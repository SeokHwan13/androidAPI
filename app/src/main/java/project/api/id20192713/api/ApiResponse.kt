package project.api.id20192713.api

data class ApiResponse(

    val header: Header,

    val body: Body
)
    data class Header(
        val resultCode: String,

        val resultMsg: String
    )

    data class Body(
        val pageNo: Int,

        val totalCount: Int,

        val numOfRows: Int,

        val items: List<Item>?
    )

    data class Item(
        val entpName: String,

        val itemName: String,

        val itemSeq: String,

        val efcyQesitm: String?,

        val useMethodQesitm: String?,

        val atpnWarnQesitm: String?,

        val atpnQesitm: String?,

        val intrcQesitm: String?,

        val seQesitm: String?,

        val depositMethodQesitm: String?,

        val openDe: String?,

        val updateDe: String?,

        val itemImage: String?,

        val bizrno: String?
    )

