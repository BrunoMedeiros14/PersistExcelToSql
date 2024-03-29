<h1 align="center">
  Xlsx to Sql
</h1>

<p align="center">
  <img src="https://img.shields.io/badge/v17-ec272c?logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAACXBIWXMAAA7DAAAOwwHHb6hkAAAAGXRFWHRTb2Z0d2FyZQB3d3cuaW5rc2NhcGUub3Jnm+48GgAAAvtJREFUWIXFlk1olVcQhp+rMf7fRKExaqM1CkoEUbCCknajGGoXpQHBKlm6EREKxU2hCOJGV920UKS0q4JSaCmUdFPBKlJUBENcdGdDE1r/NUm1Gh8Xcy75cntj7ne9JgOzOHPOnHnP/J0pqNSR2oCBPAqz6mkd+CivQr0B7JxJAG8Ay2cSwEng+7xKDXUy/jGwC9icW1N9FZ6lnlAfq51le8Vq7ngV40X1J3VY7UqyOep+9RO17XUCWK32q3fV7UnWpV5WD+S5qxbjreqf6pC6KcmOqoNqR977agHwi/pcfSete9J6Ry3ezKvQbNDPGdlV9WaNoczdB0YS92dkLcAKYGXuEiR/I3oKnAY6MrILRD/5shYAtbhtfsr2UsJ1qKMpNHumIwlR31LPGo0I9UgCcGq6AKCuy7x4rjqmvve6AMwzGk6n2piRN2XCcLyCXrvarX7heNnmArBN/Vb9Rt08RUiy65bEpfVGdUTdWq5b0ElHsgJwFtgN/AWcAx4Co8CTlPmLgSZgAbAUeAzcBc4D3wHPM/ddA34Ejk0w8hIAJZpN1PmbwMLEjcAwUZb3gEHg7zKDWWoD/gDeB36dsFNlDrSoh9RCFWcbytZN6kX1s0rnq/EAQA/wNXApveQOUFKcT4xj64D1QB+wFxgCtgP7gB+IEP6PqgUA0Erkw1oiJE1J/g8RggEizjeIUBSBRWlvUsoDAGqY+6eiPDPhp8Bh4AzxqgdEIjYDaxI/JIbTG/UCMJf45QaAz4E5wIfABqISSjRM5EYvMK9a4zB5CD5Ihq6kS28SJZcF3kzEeYQowZfRu8B14H75RiUPHAS+IjK+l2guT8vOPANuJ65ERSIkm4BlREWcJzz6JHuwkgcWAHuAt4FVROItA8YIV48RsX7GeA4UiXJ8QHTC28Bl4DciHzYA3UQ5ZoeZqqqgMb1miBhgCsCSzP4j4N8EZmE62554C9GifycGljvll1dbhkuBrUQvWET8AWPAf4TH2hKAUeL1t4jE7UvySekFf3knR8VLHHYAAAAASUVORK5CYII=&label=Java" alt="Java" />
  <img src="https://img.shields.io/badge/v3.1.0-green?logo=springboot&logoColor=white&label=SpringBoot" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/v5.6-4479A1?logo=mysql&logoColor=white&label=MySql" alt="MySql" />
  <img src="https://img.shields.io/badge/v3.9.2-C71A36?logo=apachemaven&logoColor=white&label=Maven" alt="Maven" />
  <img src="https://img.shields.io/badge/v5.2.3-C71A36?logo=apache&logoColor=white&label=POI" alt="POI" />
  <img src="https://img.shields.io/badge/v20.10.24-blue?logo=docker&logoColor=white&label=Docker" alt="Docker" />
  <img src="https://img.shields.io/badge/v17.9.1-339933?logo=node.js&logoColor=white&label=NodeJs" alt="NodeJs" />
  <img src="https://img.shields.io/badge/v5.0.2-3178C6?logo=typescript&logoColor=white&label=Typescript" alt="Typescript" />
  <img src="https://img.shields.io/badge/v16.0.0-0F0F11?logo=angular&logoColor=white&label=Angular" alt="Angular" />
  <img src="https://img.shields.io/badge/v5.3.0-7952B3?logo=bootstrap&logoColor=white&label=Bootstrap" alt="Bootstrap" />
  <img src="https://img.shields.io/static/v1?label=ExcelToSql&message=v1.0.0&color=00F" alt="ExcelToSql" />
</p>

A full-stack project developed to solve a code challenge.

[click here](./README.pt-br.md) to see the documentation in Portuguese :brazil:

## Technologies

- Back-end
  - [Java](https://www.java.com/)
  - [Maven](https://maven.apache.org/)
  - [MySql](https://www.mysql.com/)
  - [h2](https://www.h2database.com/html/main.html)
  - [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.2/reference/htmlsinge/index.html#data.sql.jpa-and-spring-data)
  - [Spring Boot](https://spring.io/projects/spring-boot)
  - [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
  - [Validation](https://docs.spring.io/spring-boot/docs/3.1.2/reference/htmlsinge/index.html#io.validation)
  - [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.2/reference/htmlsinge/index.html#web)
  - [Apache POI](https://poi.apache.org/)
- Front-end
  - [NodeJs](https://nodejs.org/en)
  - [Typescript](https://www.typescriptlang.org/)
  - [Angular](https://angular.io/)
  - [Bootstrap](https://getbootstrap.com/)
- Extas
  - [Docker](https://docs.docker.com/)
  - [Docker Compose](https://docs.docker.com/compose/)

## Application Proposal

Make an API capable of manipulating Excel spreadsheets with the Spring framework that, when it receives a spreadsheet, is capable of extracting data from that spreadsheet and save it in an SQL database.

### Objectives

- [x] Read and extract the data from the Excel file sent by e-mail;
- [x] Store the extracted data in a database;
- [x] Display in an on-screen table, sorted by the age of the participants, with the following data:
  1. name;
  2. age;
  3. average grade.
- [x] Export Excel report with the data from the database.

Here's how to run the back-end [aqui](./backend/README.md)

Here's how to run the front-end [aqui](./frontend/README.md)

## Extra

**Dockerfile** files have been added to the project, along with the **docker-compose.yml** file in the root, to add Docker compatibility to the project.

To run the project with Docker, simply have both _Docker_ and _Docker Compose_ installed, and execute the command `docker-compose up` in the terminal.

---

## Developed by

[<img width="100px" src="https://avatars.githubusercontent.com/u/100999610" alt="Profile picture"/>](https://github.com/BrunoMedeiros14 'Profile on GitHub (BrunoMedeiros)')

<p align="center">By <strong><a href="https://github.com/BrunoMedeiros14">Bruno Medeiros</a></strong>.</p>
