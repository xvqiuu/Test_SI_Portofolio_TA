Feature: Profil Pengguna

  Scenario: Pengguna melihat informasi detail profil
    Given Pengguna mengakses halaman landing
    And Pengguna menekan ikon profil dan mengakses halaman profil
    When Halaman profil dimuat
    Then Informasi detail profil pengguna harus ditampilkan