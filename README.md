# Xlsx to Sql

API desenvolvida para solucionar proposta solicitada pela Teste Rodarte Nogueira através de processo seletivo

## Atividade proposta

Fazer um API capaz de manipular planilhas excel com o framework Spring que ao receber um planilha, seja capaz de extrair
os dados dessa planilha e salvar em um banco de dados SQL.

### Objetivos

- [x] Realizar a leitura e extração dos dados do arquivo Excel enviado por e-mail;
- [x] Armazenar os dados extraídos em base de dados;
- [x] Exibir em uma tabela na tela ordenada pela idade dos participantes, com os seguintes dados:
  1. nome;
  2. idade;
  3. média das notas.
- [x] Exportar relatório Excel com os dados do banco de dados.

## Stack utilizada

- Back-end
  - Java
  - Spring
  - JPA
  - MySql
- Front-end
  - Nodejs
  - Angular
  - Typescript

Veja como executar o back-end [aqui](./backend/README.md)

Veja como executar o front-end [aqui](./frontend/README.md)

## Extra

Foi adicionado no projeto arquivos **Dockerfile** e na raiz o **docker-compose.yml** para adicionar a compatibilidade com docker ao projeto.

Para executar o projeto com o docker, basta ter o _Docker_ e _Docker compose_ intalado e executar o comando `docker-compose up` no terminal.

---

## Desenvolvido por

[<img width="100px" src="https://avatars.githubusercontent.com/u/100999610" />](https://github.com/BrunoMedeiros14 'Perfil no GitHub (BrunoMedeiros)')

<p align="center">By <strong><a href="https://github.com/BrunoMedeiros14">Bruno Medeiros</a></strong>.</p>
