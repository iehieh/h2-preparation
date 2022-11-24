This project helps to test your SQL statements for the task
[Task #1. SQL](https://github.com/mjc-school/stage2-module3-SQL-tasks).

To make an executable jar.

```shell
mvn clean package
```

To run and initialize H2 for the 7th lesson, for example.

```shell
java -jar sql-task-helper-2.0.0.jar --lesson=7 
```

The `--lesson=<number>` argument is used to determine a lesson number.

After a start you information about connection to H2 console will be available in console
if there are no issues.

```
2022-11-24 14:43:36.269  INFO 55398 --- [           main] com.mjc.stage2.DbInformationPrinter      : H2 was populated for the Lesson 7.
2022-11-24 14:43:36.269  INFO 55398 --- [           main] com.mjc.stage2.DbInformationPrinter      : Console is available at http://127.0.1.1:8181/lesson7/h2
2022-11-24 14:43:36.269  INFO 55398 --- [           main] com.mjc.stage2.DbInformationPrinter      : JDBC URL: jdbc:h2:mem:university
2022-11-24 14:43:36.269  INFO 55398 --- [           main] com.mjc.stage2.DbInformationPrinter      : User Name: sa
2022-11-24 14:43:36.270  INFO 55398 --- [           main] com.mjc.stage2.DbInformationPrinter      : Password:
```

Notes:

1. For the 12th task the `TABLES_CHANGES.sql` file must be located in the directory where the `java` command is invoked.
2. SQL scripts are loaded from a GitHub repository for the task during each initialization.
