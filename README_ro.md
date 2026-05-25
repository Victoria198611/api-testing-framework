Framework de testare API în Java cu RestAssured, TestNG și Allure Reporting

Acest proiect reprezintă un framework pentru testarea API urilor, construit în Java, folosind RestAssured, TestNG și Allure Reporting. Framework ul este structurat pentru a fi ușor de extins și utilizat în proiecte reale și include integrare completă cu Allure, modele POJO, logging și un pipeline CI/CD configurat cu GitHub Actions.

Tehnologii folosite
Java 17 RestAssured 5 TestNG 7 Allure TestNG și Allure RestAssured Maven Jackson pentru serializare și deserializare SLF4J pentru logging.

Structura proiectului
src
├── main
│   └── java
│       ├── org.example
│       │   └── App
│       └── utils
│           └── ConfigReader

└── test
    ├── java
    │   └── api
    │       ├── models
    │       │   ├── GetUserResponse
    │       │   ├── Support
    │       │   ├── UserData
    │       │   ├── UserRequest
    │       │   └── UserResponse
    │       ├── services
    │       │   ├── BaseService
    │       │   └── UserService
    │       └── tests
    │           ├── GetUserTest
    │           └── TestBase
    └── resources
        ├── config.properties
        └── environment.properties

pom.xml  
testng.xml  
README_eng.md  
README_ro.md

Cum rulezi testele
Comandă pentru rularea testelor: mvn clean test
Generarea raportului Allure local: allure generate target/allure-results --clean allure open allure-report

Raport Allure Online
Raportul Allure este generat automat de GitHub Actions și publicat pe GitHub Pages. Poate fi accesat aici: https://victoria198611.github.io/api-testing-framework/

Integrare CI/CD
Proiectul este integrat cu GitHub Actions. La fiecare push pe branch ul main:
– sunt rulate testele – este generat raportul Allure – raportul este publicat online
Workflow ul rulează comanda mvn clean test și procesează automat fișierele Allure.

Fișierul environment.properties
Acest fișier este inclus automat în raportul Allure.
Exemplu:
base.url=https://reqres.in environment=local api.version=v1 tester=Victoria

Comenzi utile
Listare rezultate Allure: ls target/allure-results
Ștergere rezultate Allure: rm -r target/allure-results

Funcționalități ale framework ului
Testare API pentru GET, POST, PUT și DELETE Validare status code Validare body JSON Logging complet pentru request și response Integrare Allure pentru atașamente, environment și timeline Structură scalabilă pentru proiecte mari

Rezultate și metrici
8 teste API (CRUD + negative) Execuții recente: 100% succes Raport Allure complet și publicat automat

Ce am învățat din acest proiect
– Construirea unui framework API modular în Java – Organizarea testelor pe modele, utilitare și clase dedicate – Integrarea Allure Reporting – Configurarea Maven și pluginuri – Serializare și deserializare JSON cu Jackson – Folosirea Git și GitHub pentru versionare și CI/CD – Configurarea fișierului .gitattributes – Analiza răspunsurilor API (status code, body, headers) – Crearea unui README profesionist pentru portofoliu

Autor
Victoria – QA Automation Tester Acest proiect face parte din portofoliul meu profesional și reflectă progresul meu în testarea automată a API urilor.
