package com.company;

public class Story {
    private Situation start_story;
    public Situation current_situation;

    Story() {
        start_story = new Situation(
                "Первый звонок из Орифлейм",
                "Здравствуйте, вас беспокоят из компании Орифлейм!"
                        + "Можете ли вы сейчас говорить?\n"
                        + "(1)НЕ БЕСПОКОЙТЕ МЕНЯ БОЛЬШЕ\n"
                        + "(2)Я весь в вашем распоряжении",
                2);
        start_story.direction[0] = new Situation(
                "Злобный клиент",
                "*Злобно бросает трубку*",
                0);
        start_story.direction[1] = new Situation(
                "Клиент, который настроен доброжелательно",
                "Позвольте рассказать вам о нашем ассортименте\n"
                        + "*долгое и интересное обсуждение продукции лучшей компании на свете*",
                0);
        current_situation = start_story;

    }
    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}
