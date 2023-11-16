package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

        var username = ""
        var password = ""

        try {
            print("Masukkan username: ")
            username = readLine()!!

            print("Masukkan password: ")
            password = readLine()!!

            // Proses autentikasi (gantilah dengan logika autentikasi sesungguhnya)
            authenticate(username, password)

            println("Autentikasi berhasil!")
        } catch (e: Exception) {
            println("Terjadi kesalahan: ${e.message}")
        }
    }

    fun authenticate(username: String, password: String) {
        // Implementasikan logika autentikasi sesuai kebutuhan
        if (username == "user" && password == "pass") {
            // Logika autentikasi berhasil
        } else {
            throw IllegalArgumentException("Username atau password salah.")
        }
    }

