# Projeto de pesquisa em Qualidade de Software 

Para executa este projeto execute os seguintes comandos:

## Para limpar o cache da execução anterior
```
mvn clean compile
```

## Para remover testes gerados previamente

```
mvn evosuite:clean
```

## Para gerar novos testes e exportá-los para a localização correta
```
mvn evosuite:generate evosuite:export 
```

## Para executar os testes

```
mvn test
```

## Para coletar a coverage dos testes 

```
mvn org.pittest:pittest-maven:mutationCoverage
```