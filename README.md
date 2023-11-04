# Online Store Microservices

Proyek Online Store Microservices adalah proyek yang terdiri dari sejumlah mikroservis yang digunakan untuk membangun sistem online store. Mikroservis ini bertanggung jawab atas berbagai aspek seperti manajemen inventaris, pemrosesan pembayaran, pengelolaan pesanan, pengiriman, dan fitur bersama.

## Mikroservis

### 1. Mikroservis Inventory

Mikroservis ini bertanggung jawab untuk mengelola inventaris produk dalam toko online. Ini menyediakan layanan untuk menambah, menghapus, dan mengambil informasi inventaris.

### 2. Mikroservis Payment

Mikroservis Payment mengelola proses pembayaran dalam toko online. Ini menyediakan API untuk melakukan pembayaran dan mendapatkan rincian pembayaran.

### 3. Mikroservis Order

Mikroservis ini mengurus pesanan pelanggan. Ini memungkinkan pelanggan untuk menempatkan pesanan, mengelola pesanan yang ada, dan mengakses riwayat pesanan.

### 4. Mikroservis Shipping

Mikroservis Shipping bertanggung jawab untuk pengiriman pesanan. Ini menyediakan API untuk mengatur pengiriman dan melacak status pengiriman.

### 5. Shared Microservice

Mikroservis ini berisi entitas bersama yang digunakan oleh mikroservis lain, seperti model data yang bersama atau kode yang digunakan di seluruh proyek.

## Teknologi yang Digunakan

- Java (bahasa pemrograman)
- Spring Boot (framework)
- Maven (manajemen dependensi dan build)
- Spring Data (untuk interaksi dengan database, opsional)
- Dan lain-lain sesuai kebutuhan proyek Anda

## Cara Menggunakan

1. **Pra-syarat**: Pastikan Anda telah menginstal Java dan Maven di lingkungan pengembangan Anda.

2. **Klon Proyek**: Klon atau unduh proyek ini ke komputer Anda.

   ```bash
   git clone https://github.com/SaipulImdn/online-store-microservices.git
   ```

3. **Mengatur Konfigurasi**: Pastikan untuk mengkonfigurasi setiap mikroservis, termasuk file `application.properties` atau `application.yml` jika diperlukan.

4. **Menjalankan Aplikasi**: Jalankan masing-masing mikroservis dengan perintah berikut:

   ```bash
   cd microservice-inventory
   mvn spring-boot:run
   ```

   Ulangi langkah yang sama untuk setiap mikroservis (Payment, Order, Shipping).

5. **Mengakses API**: Mikroservis akan berjalan di `http://localhost:8080`. Anda dapat mengakses API melalui URL ini untuk setiap mikroservis.

## Kontribusi

Jika Anda ingin berkontribusi pada proyek ini, silakan buat _fork_ proyek ini, buat perubahan yang diperlukan, dan ajukan _pull request_. Kami sangat menghargai kontribusi Anda.

## Lisensi

Proyek ini dilisensikan di bawah lisensi MIT. Lihat berkas [LICENSE](LICENSE) untuk detailnya.
