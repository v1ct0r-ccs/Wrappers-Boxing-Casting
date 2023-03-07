# Tipos complexos, boxing (autoboxing), unboxing e casting

Tipos complexos de variáveis

## Tipos complexos (Wrappers)

Primitivos
- boolean
- byte
- char
- short
- int
- long
- float
- double

Wrappers
- Boolean
- Byte
- Character
- Short
- Integer
- Long
- Float
- Double

## Boxing (autoboxing)

Boxing ou Autoboxing é a conversão de tipos primitivos para classes wrappers correspondente.

Exemplos:
- Boolean a = true;
- Byte b = 1;
- Character c = 'c'
- Short s = 1;
- Integer i = 1;
- Long l = 1L;
- Float f = 1.0F;
- Double d = 1.0;

## Unboxing

Unboxing é quando você quer converter o valor de um objeto Wrapper para o seu correspondente tipo primitivo.

Exemplos:
- boolean a = new Boolean ("True");
- byte b = new Byte("1");
- char c = new Charecter('c');
- short s = new Short ((short)1);
- int i = new Interger(1);
- float f = new Float (1.0f);
- double d = new Double(1.0);

## Casting

-   Para: | - byte | - short  | - char | - int | - long | - float | - double |
- De:        
- byte    |  ---   |   Impl.  | (char) | Impl. |  Impl. |  Impl.  |   Impl.  |
- short   | (byte) |    ---   | (char) | Impl. |  Impl. |  Impl.  |   Impl.  |
- char    | (byte) |  (short) |   ---  | Impl. |  Impl. |  Impl.  |   Impl.  |
- int     | (byte) |  (short) | (char) |  ---  |  Impl. |  Impl.  |   Impl.  |
- long    | (byte) |  (short) | (char) | (int) |   ---  |  Impl.  |   Impl.  |
- float   | (byte) |  (short) | (char) | (int) | (long) |   ---   |   Impl.  |
- double  | (byte) |  (short) | (char) | (int) | (long) | (float) |    ---   |

### Casting de primitivos

Casting é um recurso, que possibilita mudar um valor de um tipo para o outro. as vezes isso é feito automático, que chamamos de castig IMPLÍCITO e também pode ser feito por você, chamado de casting EXPLÍCITO.

Tipos e tamanhos 
- boolean - 1bit 
- byte - 8 bits
- char - 16 bits
- short - 16 bits
- int - 32 bits
- long - 32 bits
- float - 64 bits
- double - 64 bits

### Casting explícito

int num1 = 10;
short num2 = num1; (Erro de compilação)

Por que no caso acima o java não nos permite fazer num2 = num1 direto?

Por que num1 é do tipo `int` que é maior que `short`. Um int(32 bits) é maior que um short(16 bits) à nível de armazenamento. o java nã opermite que um tipo maior seja convertido para um tipo menor, ele faz isso como medida de segurança, para isso é preciso fazer o casting explícito.

### Casting

Observações sobre tipos primitivos:
- boolean - Não pode ser moldado para nunhum outro tipo, tanto implicitamente quando explicitamente.
- char - Nenhum outro tipo pode ser moldado para char.
- long é semelhante a um inteir, mas com uma possibilidade maior de números.

### Casting implícito

byte b = 1;
short s = b;

Este é um casting implicito porque não foi preciso deixar claro que estamos convertendo ume byte para short, porque byte é menor que short. Toda variável que é menor pode ser feito o casting implivito para qualquer outro tipo maior.