/* Equipo: Andrés Barragán, Lorenzo Jácome, Patricio Tena
   Proyecto: Matemáticas Discretas -Sistemas Expertos - Orientación Voacional
 */
import java.util.Scanner;

public class ProyectoOrientacion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inpt;
        char inptString;
        int test = 0;

        System.out.println("    *****************************");
        System.out.println("    *TEST ORIENTACIÓN VOCACIONAL*");
        System.out.println("    *****************************");

        while (test == 0) {
            //Servicio social = ss
            int ss = 0;
            //Arte = art
            int art = 0;
            //Ciencias = ce
            int ce = 0;
            //Ejecutivo = ejec
            int ejec = 0;

            System.out.println("Bienvenido al Test de Orientación Vocacional. ");
            System.out.println("Durante el siguiente test analizaremos sus habilidades, gustos, personalidad y competencias. ");
            System.out.println("En base a esto encontraremos una carrera que creemos es apta para usted. ");
            System.out.println("Para que los resultados sean lo mas precisos posibles, por favor: ");
            System.out.println("-Sea lo mas honesto que se pueda. ");
            System.out.println("-Solo ingrese los valores enteros 1, 2, 3 o 4. ");
            System.out.println();

            //Personalidad
            System.out.println("Primero vamos a analizar tu personalidad.");
            System.out.println("Responda del 1 al 4 que tanto hace alguna de las siguientes actividades, donde 1 es nunca y 4 es siempre.");
            System.out.println("Del 1 al 4... ");

            System.out.println("¿Qué tanto te gusta atender gente que padezca alguna enfermedad/discapacidad?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tanto te gusta/gustaría publicar textos y que tuvieran un público?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Qué tanto se te facilita el explicar problemas matemáticos a otras personas?");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Qué tanto te gusta ser quien maneja los archivos y documentos de un equipo o sociedad?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Qué tanto disfrutas / disfrutarías pertenecer a un grupo de ayuda social?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tanto participas/te involucras en actividades y discusiones de clase?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Qué tan dispuesto estás a participar en una campaña que enseñe a leer a personas analfabetas?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tan ordenado llevas tus libros y cuadernos?  ");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Qué tanto te gusta investigar acerca de movimientos sociales y sus causas (sin necesariamente estar involucrados en estos)?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tanto te gustaría ser el organizador de una campaña política? ");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Qué tanto disfrutas tocar un instrumento musical?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Qué tanto te gusta construir objetos (desde LEGOS hasta muebles)?");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("Si alguien más está siendo molestado por otra persona ¿Que tan probable es   que intervengas?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("Un compañero está teniendo dificultades con la escuela ¿Que tan dispuesto estás a ayudarlo a pasar por estos momentos?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tanto te gusta / gustaría formar parte de una obra teatral?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Qué tan al tanto estás del mundo de las ciencias y tecnologías?");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Qué tanto disfrutas organizar y arreglar colecciones personales y bibliotecas?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿La equidad de las clases sociales es un tema que te llama la atención? ");
            inpt = scan.nextInt();
            ss = ss + inpt;

            //Habilidades
            System.out.println("Ahora analizaremos tus habilidades.");
            System.out.println("Se te va a preguntar que tan habil eres en diferentes ambitos.");
            System.out.println("Responde ingresando un valor del 1 al 4, donde 1 es nada de habilidad y 4 es mucha habilidad");

            System.out.println("¿Qué tan común es que trates a las personas con tacto y sensibilidad?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tan bueno eres dibujando?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Qué tan fácil te resulta comprender los temas vistos en la clase de matemáticas?");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Qué tan fácil te es expresarte frente a la clase?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Que tanto se te facilita escuchar a otros y comprender su punto de vista?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tan simple te es componer versos serios?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Qué tanto se te facilita organizar eventos? ");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Qué tan fácil te es comprender principios y hechos económicos y sociales?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tan simple te es escribir cuentos o narraciones?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Que tanto se te facilita el desarmar, armar y componer objetos complicados?");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Qué tan ordenado eres?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Qué tan simple te es determinar las causas de acontecimientos históricos?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tan fácil te es realizar modelos con barro, plastilina o en 3D?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Qué tan fácil te es entender principios y experimentos de física? ");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Qué tan fácil te es llevar el orden de tus archivos?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Qué tanta paciencia tienes al explicar? ¿Te es fácil explicar algo sin ofender   a quien le estas explicando?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tan simple te es distinguir y apreciar la buena literatura?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Qué tan simple te es convencer a otros para que hagan lo que tú crees correcto?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Qué tan simple te es distinguir y apreciar la buena pintura?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Qué tan fácil te es comprender el mecanismo de aparatos como relojes y motores?");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Qué tan simple te es recibir, anotar, y dar recados sin olvidar detalles? ");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            //Competencias
            System.out.println("Ahora estudiaremos tus competencias.");
            System.out.println("Vamos a realizar preguntas acerca de en que eres competente.");
            System.out.println("Responde ingresando un valor del 1 al 4, donde 1 es nada competente y 4 es muy competente.");

            System.out.println("¿Qué tan rápido puedes reunir un equipo para colaborar hacía algún bien de la comunidad?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Que tan rapido eres realizando operaciones matemáticas?");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Que tanto se te facilita ser líder de un equipo?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Que tan bueno eres colaborando para hacer más eficiente el trabajo?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tan fácil te es dibujar un paisaje?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Que tanto se te facilita el armar y componer objetos mecánicos?");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Trabajando en equipo ¿ Que tanto le aportas al equipo?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("Al ayudar a otras personas, ¿Cada cuanto lo haces sin algún interés?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Que tanto disfrutas pertenecer a un club o sociedad?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Que tanto se te facilita tocar un instrumento musical?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Que tan facil te es dar órdenes a otros con seguridad y naturalidad?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Qué tan fácil manejas con exactitud y rapidez nombre, números y otros tipos de datos?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Que tan eficiente eres resolviendo problemas de algebra?");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Que tan simple te es dirigir a un grupo en situaciones difíciles?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Que tan simple te es exponer acerca de algún tema sin miedo a ser juzgado?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            //Gustos
            System.out.println("Para finalizar, vamos a conocer tus gustos.");
            System.out.println("Vamos a realizar preguntas a cerca de lo que te gusta.");
            System.out.println("Responde ingresando un valor del 1 al 4, donde 1 es que no te gusta nada y 4 que te gusta mucho");

            System.out.println("¿Qué tan dispuesto estás a salir a participar en movimientos sociales que promuevan ideologías que apoyas?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tanto disfrutas escribir (artículos, historias, crónicas, etc.)?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Qué tanto disfrutas resolver problemas matemáticos? ");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Te gusta ser el representante de equipos/grupos? ");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Qué tanto disfrutas pintar y dibujar?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Te gusta diseñar campañas que difundan una idea / proyecto que apoyas?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Qué tanto disfrutas realizar experimentos en laboratorio? ");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Qué tanto disfrutas cantar?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Qué tanto disfrutas resolver problemas aritméticos? ");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Qué tanto te gusta ayudar a evaluar pruebas? ");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Qué tan probable es que comentes acerca de una inconformidad social en tus redes sociales?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tan seguido te tomas el tiempo de resolver problemas mediante programación?");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Qué tanto te gusta / gustaría formar parte de un concurso de oratoria?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Te gusta participar en concursos de matemáticas, programación o alguna otra ciencia?");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Qué tanto disfrutas leer en tiempos libres?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Te gusta formar parte en ferias de ciencias?");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Te gusta ayudar a albergues de animales?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tanto te gusta realizar modelos de barro, plastilina o 3D?");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Qué tanto te gustaría trabajar investigando en un laboratorio?");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Te gustaría trabajar en relaciones sociales de una gran empresa?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            System.out.println("¿Te gustaría trabajar como funcionario público representante de las clases humildes?");
            inpt = scan.nextInt();
            ss = ss + inpt;

            System.out.println("¿Qué tanto te gusta diseñar logos? ");
            inpt = scan.nextInt();
            art = art + inpt;

            System.out.println("¿Qué tanto te gustaría ser el experto calculista de una institución? ");
            inpt = scan.nextInt();
            ce = ce + inpt;

            System.out.println("¿Te gustaría ser un técnico organizador de oficinas?");
            inpt = scan.nextInt();
            ejec = ejec + inpt;

            //ss 18
            //art 17
            //ce 18
            //ejec 25
            //ss+art+ce+ejec 80
            float promSS = (ss * 100) / 72;
            float promART = (art * 100) / 68;
            float promCE = (ce * 100) / 72;
            float promEJEC = (ejec * 100) / 100;

            //s = Servicios Sociales
            //a = arte
            //c = ciencias exactas
            //e = ejecutivo
            boolean s = true;
            boolean a = true;
            boolean c = true;
            boolean e = true;

            System.out.println("En base a nuestro test, consideramos que usted debería estudiar: ");
            if (promSS <= 70) {
                s = false;
            }
            if (promART <= 70) {
                a = false;
            }
            if (promCE <= 70) {
                c = false;
            }
            if (promEJEC <= 70) {
                e = false;
            }

            if (s && a && c && e) {
                System.out.println("Ingeniería en Innovación y Desarrollo(IID)");
            }
            if (s && a && c && !e) {
                System.out.println("Ingeniero en Desarrollo Sustentable (IDS)");
            }
            if (s && a && !c && e) {
                System.out.println("Licenciado en Relaciones Internacionales (LRI)");
            }
            if (s && a && !c && !e) {
                System.out.println("Licenciado en Urbanismo (LUB)");
            }
            if (s && !a && c && e) {
                System.out.println("Ingeniería en Desarrollo Sustentable (IDS)");
            }
            if (s && !a && c && !e) {
                System.out.println("Licenciado en Nutrición y Bienestar (LNB)");
            }
            if (s && !a && !c && e) {
                System.out.println("Licenciado en Derecho (LED)");
            }
            if (s && !a && !c && !e) {
                System.out.println("Licenciado Gobierno y Transformación Pública (LTP)");
            }
            if (!s && a && c && e) {
                System.out.println("Ingeniero Civil (IC)");
            }
            if (!s && a && c && !e) {
                System.out.println("Arquitecto (ARQ)");
            }
            if (!s && a && !c && e) {
                System.out.println("Licenciado en Mercadotecnia (LEM)");
            }
            if (!s && a && !c && !e) {
                System.out.println("Licenciado en Arte Digital (LAD)");
            }
            if (!s && !a && c && e) {
                System.out.println("Ingeniero en Transformación Digital de Negocios (ITD)");
            }
            if (!s && !a && c && !e) {
                System.out.println("Ingeniero en Ciencias de Datos y Matemáticas (IDM)");
            }
            if (!s && !a && !c && e) {
                System.out.println("Licenciado en Emprendimiento (LDE)");
            }
            if (!s && !a && !c && !e) {
                System.out.println("Tomate un tiempo para reflexionar acerca de tu personalidad, habilidades, competencias y gustos y vuelve a tomar el test.");
            }

            System.out.println("Precione 1 si desea salir del programa. ");
            System.out.println("Precione cualquier otro numero si desea ralizar de nuevo el test.");
            inpt = scan.nextInt();

            if (inpt == 1){
                test = 1;
            } else {
                test = 0;
            }
        }

    }

}
