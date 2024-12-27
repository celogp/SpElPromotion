```markdown
# SpElPromotion

Este projeto demonstra o uso do Spring Expression Language (SpEL) para a promoção de produtos.

## Visão Geral

O Spring Expression Language (SpEL) é uma linguagem de expressão poderosa que suporta consulta e manipulação de um gráfico de objeto em tempo de execução. Esta aplicação exemplifica como o SpEL pode ser utilizado para aplicar regras de promoção a produtos de um catálogo.

## Funcionalidades

- **Cálculo de Descontos:** Aplicação de descontos baseados em regras definidas através de expressões SpEL.
- **Promoções Personalizadas:** Criação de promoções personalizadas utilizando expressões dinâmicas.
- **Integração com Spring:** Utilização do SpEL diretamente em componentes Spring.

## Pré-requisitos

- JDK 11 ou superior
- Maven 3.6.3 ou superior

## Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/celogp/Spelpromotion.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd Spelpromotion
   ```

3. Compile o projeto utilizando Maven:

   ```bash
   mvn clean install
   ```

4. Execute a aplicação:

   ```bash
   mvn spring-boot:run
   ```

## Estrutura do Projeto

- **src/main/java:** Contém o código-fonte da aplicação.
- **src/test/java:** Contém os testes unitários.
- **pom.xml:** Contém as dependências e configurações do Maven.

## Exemplos de Uso

### Criação de Regras de Promoção

Aqui está um exemplo de como criar uma regra de promoção utilizando SpEL:

```java
@Value("#{product.price > 100 ? product.price * 0.9 : product.price}")
private double discountedPrice;
```

Neste exemplo, se o preço do produto for maior que 100, aplica-se um desconto de 10%.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

Para dúvidas ou sugestões, entre em contato através do [GitHub Issues](https://github.com/celogp/Spelpromotion/issues).

```
