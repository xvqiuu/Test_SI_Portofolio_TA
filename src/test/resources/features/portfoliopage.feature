Feature: Mengakses Portfolio Page Sistem Informasi Portfolio Tugas Akhir
  Scenario: Pengguna mengakses daftar tugas akhir
    Given Pengguna mengakses halaman dashboard
    When Pengguna menekan button “Showcase” yang terdapat pada navigation bar
    Then Sistem menampilkan daftar tugas akhir sesuai klasifikasi topik