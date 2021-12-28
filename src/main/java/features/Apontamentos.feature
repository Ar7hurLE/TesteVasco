Feature: FEATURE DE VERIFICAÇÃO

  Scenario: Verificar se o brasão do vasco encontra-se no site

    Given estamos no google
    When procuramos por vasco da gama
    And clicamos no resultado que obtém url do site oficial
    And entramos no site
    Then o brasão do Vasco deve estar lá
