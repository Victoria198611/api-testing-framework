Framework de testare API în Java cu RestAssured, TestNG și Allure Reporting

Descriere
Acest proiect reprezintă un framework modern pentru testarea API urilor, construit în Java și organizat pentru a fi ușor de extins, întreținut și folosit în proiecte reale. Include integrare completă cu Allure, generare de rapoarte, structură modulară și exemple de teste API.
 Tehnologii folosite
•	Java 17
•	RestAssured 5
•	TestNG 7
•	Allure TestNG + Allure RestAssured
•	Maven
•	Jackson pentru serializare/deserializare
•	SLF4J pentru logging
 Structura proiectului:
src
 └── test
      ├── java
      │    ├── tests/        → Testele API
      │    ├── models/       → Modele pentru request/response
      │    ├── utils/        → Utilitare (config, helpers)
      │    └── listeners/    → Integrare Allure
      └── resources
           └── environment.properties

Cum rulezi testele
1. Rulează testele
Cod
mvn clean test
2. Generează raportul Allure
Cod
allure generate target/allure-results --clean
allure open allure-report

 Rapoarte Allure
Framework ul generează automat:
•	rezultate test
•	request/response pentru fiecare test
•	environment
•	categorii
•	timeline

Fișierul environment.properties
Acest fișier este copiat automat în target/allure-results și apare în raportul Allure.
Exemplu:
Cod
base.url=https://reqres.in
environment=local
api.version=v1
tester=Victoria

Comenzi utile
•	Listare rezultate:
Cod
ls target/allure-results
•	Ștergere rezultate:
Cod
rm -r target/allure-results

Funcționalități
•	Testare API GET/POST/PUT/DELETE
•	Validare status code
•	Validare body JSON
•	Logging request/response
•	Integrare Allure pentru atașamente
•	Structură scalabilă pentru proiecte mari

Ce am învățat din acest proiect
•	Am înțeles cum se construiește un framework API modular folosind Java + RestAssured + TestNG
•	Am învățat să structurez testele pe modele, utilitare și clase dedicate
•	Am configurat și integrat Allure Reporting, inclusiv environment, atașamente și structură de raport
•	Am învățat să lucrez cu Maven, pluginuri și configurări personalizate
•	Am înțeles cum funcționează serializarea/deserializarea JSON cu Jackson
•	Am învățat să folosesc Git și GitHub pentru versionare și publicare
•	Am înțeles cum GitHub detectează limbajele și cum se configurează .gitattributes
•	Am învățat să citesc și să analizez răspunsurile API (status code, body, headers)
•	Am înțeles importanța unui README profesionist pentru portofoliu

Autor: Victoria — QA Automation Engineer Acest proiect a fost realizat ca parte a portofoliului meu profesional și pentru aprofundarea continuă a abilităților în testarea automată a API urilor.
