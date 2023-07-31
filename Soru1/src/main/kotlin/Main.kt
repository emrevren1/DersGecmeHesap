fun main() {
    var vize: Int?
    var odev: Int?
    var yilSonu: Int?
    var harf : String?
    var gecmeNotu: Double


    do {
        println("Vize notunu giriniz (0 girerek programı sonlandırın):")
        vize = readLine()?.toIntOrNull()

        if (vize == null || vize < 0 || vize > 100) {
            println("Geçersiz vize notu. Lütfen 0-100 arasında bir değer girin.")
            continue
        }

        if (vize == 0) break

        println("Ödev notunu giriniz:")
        odev = readLine()?.toIntOrNull()

        if (odev == null || odev < 0 || odev > 100) {
            println("Geçersiz ödev notu. Lütfen 0-100 arasında bir değer girin.")
            continue
        }

        println("Yıl sonu notunu giriniz:")
        yilSonu = readLine()?.toIntOrNull()

        if (yilSonu == null || yilSonu < 0 || yilSonu > 100) {
            println("Geçersiz yıl sonu notu. Lütfen 0-100 arasında bir değer girin.")
            continue
        }

        gecmeNotu = vize * 0.2 + odev * 0.2 + yilSonu * 0.6

        if (gecmeNotu >= 90) {
            harf = "AA"
        } else if (gecmeNotu >= 85) {
            harf = "BA"
        } else if (gecmeNotu >= 80) {
            harf = "BB"
        } else if (gecmeNotu >= 75) {
            harf = "CB"
        } else if (gecmeNotu >= 70) {
            harf = "CC"
        } else if (gecmeNotu >= 65) {
            harf = "DC"
        } else if (gecmeNotu >= 60) {
            harf = "DD"
        } else if (gecmeNotu >= 50) {
            harf = "FD"
        } else {
            harf = "FF"
        }


        println("Geçme notu: $gecmeNotu, Harf notu: $harf")

    } while (vize != 0)
}