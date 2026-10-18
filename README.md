# 🏦 ContaBanco - Simulação de Conta Bancária

> Desafio do módulo de **Sintaxe da Trilha Java Básico** — [Digital Innovation One (DIO)](https://dio.me)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluido-brightgreen?style=for-the-badge)

---

## 📖 Sobre o Projeto

O **ContaBanco** é uma aplicação Java de console desenvolvida para praticar conceitos fundamentais de sintaxe da linguagem. O sistema simula a criação de uma conta bancária simples: solicita dados do usuário via terminal (número da conta, agência, nome do cliente e saldo inicial) e exibe uma mensagem formatada de confirmação com os dados cadastrados.

---

## 🛠️ Tecnologias Utilizadas

- **Java JDK** (versão 8 ou superior / JDK 17+)
- **Scanner** (`java.util.Scanner`) para captura de entradas no console
- **String Formatting** (`String.format`) para interpolação limpa de dados

---

## 📁 Estrutura do Projeto

```plaintext
conta-banco/
├── src/
│   └── ContaTerminal.java
└── README.md
```

---

## ▶️ Como Executar

### Pré-requisitos
- Possuir o **Java JDK** instalado (teste com `java -version`).
- Ter o **Git** instalado no sistema.

### Passo a passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/RubensSI/dasafio-java-basico-dio.git
   cd dasafio-java-basico-dio
   ```

2. **Compile o código:**
   ```bash
   javac -d bin src/ContaTerminal.java
   ```

3. **Execute a aplicação:**
   ```bash
   java -cp bin ContaTerminal
   ```
   *(Ou execute diretamente com `java src/ContaTerminal.java` no Java 11+)*

---

## 💻 Exemplo de Execução

```text
Crie sua conta

Digite o numero da conta
1021
Digite sua agencia
067-8
Digite seu nome: 
Rubens
Digite o saldo: 
237.48
Olá Rubens, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo de R$ 237.48 já está disponível para uso
```

---

## ✅ Requisitos do Desafio

- [x] Leitura de dados via terminal utilizando `Scanner`
- [x] Exibição de mensagens orientando o usuário a cada entrada
- [x] Formatação e exibição da mensagem de boas-vindas com os dados capturados
- [x] Fechamento adequado do recurso `Scanner`

---

## 👨‍💻 Autor

Desenvolvido por **Rubens Santos**.

[![GitHub](https://img.shields.io/badge/GitHub-RubensSI-181717?style=flat&logo=github)](https://github.com/RubensSI)
