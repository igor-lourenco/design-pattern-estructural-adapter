# Adapter

O Adapter é um padrão de projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si. Em outras palavras converte a interface de uma classe em outra interface esperada pelos clientes, permitindo a comunicação entre classes que não poderiam trabalhar juntas devido a incompatibilidade de suas interfaces.

## Problema

Imagina que está criando uma conexão do Computador com a tela que tem a entrada HDMI como conexão. A applicação consegue conectar com Tvs que tem entrada HDMI, mas e quando for uma tela que tem entrada diferente como VGA por exemplo.

- Como uma classe pode ser reusada mesmo que não tenha a interface requisitada pelo cliente?
- Como classes de interfaces incompatíveis podem trabalhar juntas?

 ## Estrutura sem usar o Adapter
![adapter_before](https://github.com/igor-lourenco/design-pattern-estructural-adapter/blob/main/uml/adapter_before.png) 

## Solução

Você pode criar um adaptador. Ele é um objeto especial que converte a interface de um objeto para que outro objeto possa entendê-lo.

Um adaptador encobre um dos objetos para esconder a complexidade da conversão acontecendo nos bastidores. O objeto encobrido nem fica ciente do adaptador.

Adaptadores podem não só converter dados em vários formatos, mas também podem ajudar objetos com diferentes interfaces a colaborar. Veja aqui como funciona:

O adaptador obtém uma interface, compatível com um dos objetos existentes.
Usando essa interface, o objeto existente pode chamar os métodos do adaptador com segurança.
Ao receber a chamada, o adaptador passa o pedido para o segundo objeto, mas em um formato e ordem que o segundo objeto espera.

### Adaptador de objeto

Essa implementação usa o princípio de composição do objeto: o adaptador implementa a interface de um objeto e encobre o outro.

- O Computer é uma classe que contém a lógica de negócio do programa existente.

- A Interface HDMI descreve um protocolo que outras classes devem seguir para ser capaz de colaborar com o código cliente.

- O VGA é alguma interface útil (geralmente de terceiros ou código legado). O Computer não pode usar essa classe diretamente porque ela tem uma interface incompatível com o HDMI.

- O HDMIToVGAAdapter é uma classe que é capaz de trabalhar tanto com o Computer quanto o VGA: ela implementa a interface HDMI enquanto encobre o objeto da interface VGA. O HDMIToVGAAdapter recebe chamadas do Computer através da interface HDMI e as traduz em chamadas para o objeto implementado do VGA em um formato que ele possa entender.

- O código da classe Computer não é acoplado à classe concreta do HDMIToVGAAdapter desde que ele trabalhe com o adaptador através da interface HDMI. Graças a isso, você pode introduzir novos tipos de adaptadores no programa sem quebrar o código da classe Computer existente. Isso pode ser útil quando a interface de uma classe é mudada ou substituída, apenas pode criar uma nova classe adaptador sem mudar o código cliente.

![adapter_after_classe](https://github.com/igor-lourenco/design-pattern-estructural-adapter/blob/main/uml/adapter_after_objeto.png) 

