# language: es
@Cucumber
  Característica: Inicio de sesión en Opencart

    @CASO1
    Esquema del escenario: Ingresar al portal de Opencart
      Dado Que el usuario entra a la pagina del login
      Cuando El usuario ingresa sus credenciales:"<USUARIO>" , "<CLAVE>"
      Entonces El usuario verifica el acceso: "<NOMBREPERFIL>"

    Ejemplos:
      | USUARIO               | CLAVE |NOMBREPERFIL               |
      | danilob@keoworld.com  | 1234  |Please confirm who you are!|



  