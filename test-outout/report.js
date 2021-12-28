$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Apontamentos.feature");
formatter.feature({
  "line": 1,
  "name": "FEATURE DE VERIFICAÇÃO",
  "description": "",
  "id": "feature-de-verificação",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verificar se o brasão do vasco encontra-se no site",
  "description": "",
  "id": "feature-de-verificação;verificar-se-o-brasão-do-vasco-encontra-se-no-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "estamos no google",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "procuramos por vasco da gama",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clicamos no resultado que obtém url do site oficial",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "entramos no site",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "o brasão do Vasco deve estar lá",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.estamos_no_google()"
});
formatter.result({
  "duration": 30843787800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.procuramos_por_vasco_da_gama()"
});
formatter.result({
  "duration": 4033910800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.clicamos_no_resultado_que_obtém_url_do_site_oficial()"
});
formatter.result({
  "duration": 11591537800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.entramos_no_site()"
});
formatter.result({
  "duration": 108014100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.o_brasão_do_Vasco_deve_estar_lá()"
});
formatter.result({
  "duration": 4011780500,
  "status": "passed"
});
});