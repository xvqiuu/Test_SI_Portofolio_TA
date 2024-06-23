Feature: Mengakses Team Page Sistem Informasi Portfolio Tugas Akhir
  Scenario: Pengguna mengakses daftar dosen TRPL
    Given Pengguna mengakses halaman dashboard
    When Pengguna menekan tombol “Read More” pada card Tim Tugas Akhir
    Then Sistem menampilkan daftar dosen TRPL