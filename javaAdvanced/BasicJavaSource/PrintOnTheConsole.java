package BasicJavaSource;

public class PrintOnTheConsole {
    //created by J.M.
      /*
                                       ОТПЕЧАТВАНЕ НА ЕДИН РЕД:
         Отпечатва стринг без краен и начален спайс и заменя всички редици спейсове с по единичен:
         System.out.println(output.toString().trim().replaceAll("\\s+"," "));

         System.out.print(Arrays.toString(array).replaceAll("[\\[\\]]", "").replaceAll(", ", " "));

         System.out.println(Arrays.stream(array).mapToObj(Objects::toString).collect(Collectors.joining(" ")));

         System.out.print(Arrays.toString(new List[]{array}).replaceAll("[\\[\\]]", "").replaceAll(", ", " "));

         Integer - System.out.println( array.stream().map(String::valueOf).collect(Collectors.joining(" ")));

         Отпечатва цял стринг масив разделен със space:
         System.out.println(String.join(" ",name of string array));

         МАП В МАП ---mapInfo.forEach((key, value) -> value.forEach((key1, value1) ->
                        System.out.printf("%s - %d , %.2f", key, key1, value1)));

         Форматира изхода и го печати:
         StringBuilder output= new StringBuilder();
         numbers.forEach(number -> output.append((new DecimalFormat("0.#")).format(number)).append(" "));
         System.out.println(output);

                                      ОТПЕЧАТВАНЕ НА НОВ РЕД:
         set.stream().collect(Collectors.joining(System.lineSeparator())));
         nameList.forEach(System.out::println);
         Arrays.stream(array).forEach(System.out::println);
         IntStream.range(0, number).mapToObj(i -> new Message()).map(Message::output).forEach(System.out::println);
         Arrays.stream(array).mapToObj(value -> value + " ").forEach(System.out::print);

                                      ОТПЕЧАТВАНЕ В МАП С ПОРЕДЕН НОМЕР:
         public static int index=0; - в публик класа:
         в мейн класа:
         String [] num=new String[]{"1st","2nd","3rd"};
                mapInfo.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3)
                        .forEach(entry-> {System.out.printf("%s place: %s%n",num[index],entry.getKey()); index++; });

            mapInfo.forEach((key, value) -> {
            System.out.printf("%s->%n", key);
            value.forEach((key1, value1) ->
                    System.out.printf(" %s %s %n", key1, value1));
        });

    */
}