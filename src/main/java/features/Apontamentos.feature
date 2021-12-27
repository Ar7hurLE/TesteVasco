Feature: FEATURE DE VERIFICAÇÃO

  Scenario: Verificar se o brasão do vasco encontra-se no site

    Given estamos no google
    When clicamos no site https://vasco.com.br/
    And entramos no site
    Then o brasão do Vasco deve estar lá
