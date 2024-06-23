Feature: Mengakes Informasi Detail Dosen TRPL
  Scenario: Pengguna mengakses halaman dosen TRPL
    Given Pengguna mengakses halaman dashboard
    When Pengguna menekan tombol “Read More” pada card Tim Tugas Akhir
    Then Sistem menampilkan daftar dosen TRPL
  Scenario: Pengguna mengakses halaman detail dosen TRPL
    Given Pengguna mengakses halaman daftar dosen TRPL
    When Pengguna menekan tombol “Read More” pada salah satu card dosen TRPL
    Then Sistem menampilkan detail dosen TRPL
