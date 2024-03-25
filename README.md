# Automated Testing Framework with Java

## Tujuan Proyek
Tujuan proyek ini adalah untuk membuat sebuah framework pengujian otomatis yang dapat digunakan untuk melakukan pengujian pada aplikasi web menggunakan bahasa pemrograman Java. Framework ini menggunakan berbagai alat dan teknologi termasuk Gradle, Selenium WebDriver, Rest Assured, dan Cucumber dengan format Gherkin.

## Cara Menjalankan Proyek
Berikut adalah langkah-langkah untuk menjalankan proyek:

### Prasyarat
Pastikan Anda telah memasang perangkat lunak berikut sebelum menjalankan proyek:
- Java Development Kit (JDK)
- Gradle
- Browser (Edge)

### Langkah-langkah
1. **Clone Repositori**

2. **Masuk ke Direktori Proyek**

3. **Konfigurasi WebDriver**
Pastikan Anda telah mengatur konfigurasi WebDriver sesuai dengan browser yang ingin Anda gunakan di dalam file konfigurasi proyek.

4. **Menjalankan Pengujian**
- Untuk menjalankan pengujian web, buka file Cucumber test yang terletak di `src/test/resources/features`.
- Pilih skenario pengujian yang ingin Anda jalankan.
- Klik tombol "Play" untuk menjalankan skenario pengujian tersebut.

5. **Lihat Hasil Pengujian**
Setelah pengujian selesai, Anda dapat melihat hasilnya di laporan pengujian yang dihasilkan, biasanya berada di direktori `reports/`.

## Catatan
- Pastikan untuk mengonfigurasi URL atau endpoint yang sesuai dengan aplikasi yang ingin diuji.
- Jika ada dependensi tambahan yang diperlukan, pastikan untuk menambahkannya ke dalam berkas `build.gradle`.
- Disarankan untuk memperbarui dan menjalankan dependensi sebelum menjalankan proyek.
