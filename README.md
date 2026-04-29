# Exercício: Membros Estáticos e Blocos de Inicialização

Este módulo do projeto foca no entendimento da *memória estática da JVM* e na ordem de execução de blocos de código durante o carregamento de classes e instanciação de objetos.

## Conceitos Aplicados

### 1. Atributos e Métodos Estáticos (`static`)
Foi demonstrado o uso de membros que pertencem à **Classe** e não ao **Objeto**. 
- `contadorAcessos`: Uma variável global compartilhada por todas as instâncias da classe.
- `nomeBancoDados`: Configuração única carregada no momento em que a JVM "conhece" a classe.

### 2. Bloco de Inicialização Estático (`static { }`)
Utilizado para simular o carregamento de configurações externas (como banco de dados).
- **Regra de Ouro:** Executa apenas **uma única vez**, independentemente de quantos objetos sejam criados. É o primeiro bloco a ser executado quando a classe é referenciada.

### 3. Bloco de Inicialização Não-Estático (`{ }`)
Implementado para rastrear a criação de instâncias.
- **Regra de Ouro:** Executa **toda vez** que o operador `new` é invocado, logo antes do construtor.
- **Nota Técnica:** Neste exercício, este bloco foi utilizado para incrementar o contador estático, permitindo rastrear o número total de objetos criados durante o ciclo de vida da aplicação.

### 4. Ordem de Execução Java
O exercício prova a sequência da JVM:
1. **Bloco Estático** (Carga da Classe).
2. **Bloco Não-Estático** (Preparação da Instância).
3. **Construtor** (Finalização do Objeto).

---

## Avisos da IDE (Warnings)

Durante o desenvolvimento, o IntelliJ IDEA emite dois avisos importantes que foram mantidos pois é apenas um conteudo didático:

1.  **"Class initializer may be static"**: Ocorreu pois o bloco de inicialização altera apenas membros estáticos. Foi mantido como não-estático para garantir que o incremento ocorra a cada `new`.
2.  **"Instantiation of utility class"**: A IDE identifica que a classe possui apenas membros estáticos. A instanciação foi mantida propositalmente para validar o comportamento dos blocos de inicialização de instância.
