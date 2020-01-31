## 资料
[springboot](https://spring.io/guides/gs/serving-web-content/)

[bootstrap](https://v3.bootcss.com/components/#navbar)

[oauthapps](https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/)

[thymeleaf](http://www.thymeleaf.org)

[h2](https://mvnrepository.com/search?q=h2)

[flyway](https://flywaydb.org/getstarted/firststeps/maven)

[Lombok](https://avatars3.githubusercontent.com/u/51558201?v=4)
## 脚本

```sql
CREATE CACHED TABLE "PUBLIC"."USER"(
    "ID" INT DEFAULT NEXT VALUE FOR NOT NULL NULL_TO_DEFAULT SEQUENCE 
    "ACCOUNT_ID" VARCHAR(100),
    "NAME" VARCHAR(50),
    "TOKEN" CHAR(36),
    "GMT_CREATE" BIGINT,
    "GMT_MODIFIED" BIGINT
```
```bash
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```
