PrácƟca 1 RA4 – GesƟón de Cuenta Bancaria
Java Project
Ha de tener la nomenclatura RA4Pr1
Package
Ha de tener la nomenclatura apellido.nombre
Account class
Desarrollar una clase Account, que tendrá los siguientes atributos:
• number: número de cuenta que las idenƟfica.
• balance: saldo de cuenta
• holder: El nombre del Ɵtular.
La clase debe incorporar un constructor que reciba como parámetros todos los atributos.
Implementar, además, los métodos siguientes:
• getNumber. Devuelve el número de la cuenta.
• getBalance. Devuelve el saldo de la cuenta.
• getHolder. Devuelve el nombre del Ɵtular de la cuenta.
• setBalance. Inicializa el saldo de la cuenta.
• setHolder. Inicializa el nombre del Ɵtular de la cuenta.
Bank class
Crear una clase Bank con un método main que realice:
1) Crear cuentas.
- Pedir nombre y saldo inicial de 2 usuarios para crear 2 cuentas en un array de Ɵpo Account
Numero cuenta será un incremental empezando por 1.

2) Pintar el menú principal y procesar opción elegida.

1. Consultar saldo.
- Pedir nombre Ɵtular
- Buscar cuenta con nombre Ɵtular
- Mostrar saldo cuenta
Dep. d’Informàtica
Grupo DAM1
Módulo MP0485 - Programació
Profesores: Vicente Català, Jose Portugal

2. Ingresar dinero.
- Pedir nombre Ɵtular
- Buscar cuenta con nombre Ɵtular
- Pedir dinero a ingresar
- Añadir dinero a saldo cuenta

3. Sacar dinero.
- Pedir nombre Ɵtular
- Buscar cuenta con nombre Ɵtular
- Pedir dinero a sacar
- Verificar si hay saldo suficiente
- ReƟrar dinero de saldo cuenta

4. Realizar transferencia.
- Pedir nombre Ɵtular origen
- Buscar cuenta con nombre Ɵtular origen
- Pedir nombre Ɵtular desƟno
- Buscar cuenta con nombre Ɵtular desƟno
- Pedir dinero a transferir
- Verificar si hay saldo suficiente
- Mover dinero actualizando ambos saldos

Test unitario
1. Verificar se crean 2 cuentas por menú
2. Verificar operación consulta saldo muestra datos
3. Verificar operación consulta saldo no encuentra Ɵtular mostrando error
4. Verificar operación ingresar dinero añade la canƟdad al saldo inicial
5. Verificar operación sacar dinero resta la canƟdad al saldo inicial
6. Verificar operación sacar dinero no puedo sacar mas dinero que saldo inicial
7. Verificar operación realizar transferencia mueve canƟdad actualizando ambos saldos
origen y desƟno
8. Verificar operación realizar transferencia no se permite si se mueve mas dinero que
saldo inicial en cuenta origen
9. Verificar operación realizar transferencia no encuentra Ɵtular origen/desƟno
mostrando error
10. Verificar operación salir finaliza de manera controlada la ejecución del programa
