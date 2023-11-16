package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    // Variable bertipe data string yang menyimpan nilai nama depan Saya
    val firstName: String = "Rizky"

    // Variable bertipe data string yang menyimpan nilai nama belakang Saya
    val lastName: String = "Aprinanda"

    // Variable bertipe data number yang menyimpan nilai umur Saya
    val age: Int = 30

    // Variable bertipe data boolean yang menyimpan nilai status Saya (single atau tidak)
    val isSingle: Boolean = false

    // Cetak setiap variabel ke layar saat variable myProfile di panggil
    println("Hello! Let me introduce my self. My Name is $firstName $lastName")
    println("My age is $age years old, and my status is ${if (isSingle) "single" else "not single"}")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("List: $groupMember")
    println("Session: $session")

    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val teamMembers = listOf(
        "Ardini Dhaniyah", "Alif Januantara Prima", "Yoga Pradana Budiyanto",
        "Dedi Afrizal", "Muhammad Septhian Rafi Falah", "Afif Waliyudin",
        "Roshans Aland Hakim", "Irfan Rian Fahmi", "Steffany", "Rizky Aprinanda"
    )

    val myName = "I, ${teamMembers[9]}, am part of the team"


    return teamMembers
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Kak Jovian", "Kak Imam")
    val totalTeamMember = myTeam().size
    val countOfGroup = mentor.size + totalTeamMember

    return countOfGroup
}

fun main() {
    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Unlimited Innovation",
        listOf(myTeam), "Afternoon")
}
