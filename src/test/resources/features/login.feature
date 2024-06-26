Feature: Login

  Scenario: User berhasil login dengan kredensial yang valid
    Given User mengakses halaman login
    When User submit dengan kredensial yang valid
    Then Halaman landing page harus ditampilkan

