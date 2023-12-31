# Back-end

Aplicação criada usando Spring e JPA de maneira que foi disponibilizada as respectivas rotas:

- `Get`: /api/v1/participants
  > Para visualizar todos os participantes disponíveis em ordem crescente de idade.
- `Post`: /api/v1/participants
  > Para cadastrar um único participante.
- `Get`: /api/v1/participants/spreadsheet
  > Para baixar uma planilha conforme o modelo solicitado.
- `Post`: /api/v1/participants/spreadsheet
  > Para cadastrar vários participantes de uma vez utilizando arquivo excel.

## Executando a aplicação

Execute o comando `mvn spring-boot:run` dentro da pasta [backend](/backend/)

> Para o funcionamento sem a necessidade de um banco de dados mysql, foi feita a configuração para o possível funcionamento com o banco de dados H2 e sqlite, sendo possível escolher qual utilizar alterando a variável `APP_PROFILE` no [application.yml](./excel-to-sql/src/main/resources/application.yml) entre ['dev','lite','test']

A aplicação ficará rodando no `localhost:8080`

---

## Desenvolvido por

[<img width="100px" src="https://avatars.githubusercontent.com/u/100999610" alt="Foto de perfil"/>](https://github.com/BrunoMedeiros14 'Perfil no GitHub (BrunoMedeiros)')

**[Retornar para página anterior](../README.pt-br.md)**

<p align="center">By <strong><a href="https://github.com/BrunoMedeiros14">Bruno Medeiros</a></strong>.</p>
