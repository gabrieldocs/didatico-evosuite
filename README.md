# Projeto de pesquisa em Qualidade de Software 


Para gerar a documentação com JavaDoc execute o seguintes comandos:

```
mvn javadoc:javadoc
```

Para executa este projeto execute os seguintes comandos:

## Para limpar o cache da execução anterior
```
mvn clean compile
```

## Para remover testes gerados previamente

```
mvn evosuite:clean
```

## Utilizando o EvoSuite com o Maven

Para gerar novos testes de forma automática com o EvoSuite e em seguida exportá-los para a localização correta no projeto execute o seguinte comando:

```
mvn evosuite:generate evosuite:export 
```

## Para executar os testes

Para executar os testes (feitos manualmente ou automaticamente) execute o seguinte comando:


```
mvn test
```

## Para coletar a cobertura dos testes 

Para quem estiver empregando o EvoSuite como ferramenta de suporte na escrita dos teste é necessário empregar 

```
mvn org.pittest:pittest-maven:mutationCoverage
```