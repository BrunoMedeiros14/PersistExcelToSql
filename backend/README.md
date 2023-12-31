# Back-end

Application created using Spring and JPA in such a way that the following routes were made available:

- `Get`: /api/v1/participants
  > To view all participants available in ascending order of age.
- `Post`: /api/v1/participants
  > To register a single participant.
- `Get`: /api/v1/participants/spreadsheet
  > To download a spreadsheet according to the requested model.
- `Post`: /api/v1/participants/spreadsheet
  > To register multiple participants at once using an Excel file.

## Running the application

Run the command `mvn spring-boot:run` inside the [backend](/backend/) folder.

> For operation without the need for a MySQL database, configuration was made for possible operation with H2 and SQLite databases. It is possible to choose which one to use by changing the `APP_PROFILE` variable in [application.yml](./excel-to-sql/src/main/resources/application.yml) between ['dev','lite','test'].

The application will be running on `localhost:8080`

## Developed by

[<img width="100px" src="https://avatars.githubusercontent.com/u/100999610" alt="Profile picture"/>](https://github.com/BrunoMedeiros14 'Profile on GitHub (BrunoMedeiros)')

**[Return to previous page](../README.md)**

<p align="center">By <strong><a href="https://github.com/BrunoMedeiros14">Bruno Medeiros</a></strong>.</p>
