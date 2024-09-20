# Java-ITP-W4-S5-PF-SelectionUsingSwitch-Case

Kelas Introduction to Programming / Week 4 / Session 5

### Penjelasan:
- **Scanner scan**: Digunakan untuk membaca input dari pengguna.
- Definisi Variabel untuk menampung input dari user.
- Meminta input Nama Barang dari user.
- Meminta input Harga Barang dari user.
- Meminta input Jumlah Barang dari user.
- Menghitung total harga dengan rumus Harga Barang x Jumlah Barang, kemudian disimpan dalam variabel `total_harga`.
- Masuk ke pengkondisian untuk menentukan besaran diskon yang didapat.
- Karena `switch-case` tidak bisa menangani kondisi rentang (misalnya, >= 500000), perlu menggunakan teknik yang berbeda. Salah satu pendekatannya adalah mengelompokkan kondisi dalam bentuk kategori atau membagi nilai total harga dengan jumlah tertentu.
- Di sini, kita akan membagi nilai `total_harga` dan membuat `case` berdasarkan kategori tertentu.
- Pembagian `total_harga` dengan 100000: Kita gunakan variabel `kategoriHarga` untuk menentukan rentang diskon. Nilai ini digunakan dalam `switch-case` untuk menentukan kategori harga berdasarkan hasil pembagian.
  - Jika total_harga adalah 550000, kategoriHarga menjadi 5, dan jatuh ke dalam case 5 (yang memberikan diskon 50%).
- Switch dengan `default`: Case `default` menangani situasi di mana `total_harga` kurang dari 100000, yang tidak mendapat diskon.


Sekian.

Habib Azizul Haq  
(2702488253)
