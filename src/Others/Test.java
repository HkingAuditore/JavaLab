package Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

class GradeDict{
    String name;
    double score;

    public GradeDict(String name, double score) {
        this.name  = name;
        this.score = score;
    }
}
class Test {
//    public static void processScores(GradeDict[] listArray,double ... scoreGapArgs){
//        var list = Arrays.stream(listArray).collect(Collectors.toList());
//        int num = list.size();
//        GradeDict highest = list.stream().max((a,b) -> a.score > b.score ? 1 : -1).get();
//        GradeDict lowest = list.stream().min((a,b) -> a.score > b.score ? 1 : -1).get();
//        double averageScore = (list.stream().mapToDouble(a -> a.score).sum()) / num;
//        int[] scoresSampler = new int[scoreGapArgs.length-1];
//        for (int i = 0;i < scoreGapArgs.length - 1;i++){
//            int tmp = i;
//            scoresSampler[i] = (int) list.stream().filter(a -> a.score > scoreGapArgs[tmp] && a.score <= scoreGapArgs[tmp + 1]).count();
//        }
//
//        System.out.println("人数：" + num );
//        System.out.println("最高分：" + highest.score);
//        System.out.println("最低分：" + lowest.score);
//        System.out.println("平均分：" + averageScore);
//        for (int i = 0;i < scoresSampler.length;i++){
//            System.out.println(scoreGapArgs[i] + "~" + scoreGapArgs[i+1] + "百分比：" + ((scoresSampler[i] / (double)num)*100) + "%");
//        }
//    }
    public static void processScores(GradeDict[] gradeList,double maxScore,double ... scoreGapArgs){
        int count = 0;
        double highestScore = 0;
        double lowestScore = maxScore;
        double       scoreSum = 0;
        List<Double> gaps = DoubleStream.of(scoreGapArgs).boxed().collect(Collectors.toList());
        gaps.add(0,0.0);
        gaps.add(maxScore);
        int[] gapNums = new int[gaps.size()-1];
        for (GradeDict grade: gradeList) {
            count++;
            highestScore = Math.max(grade.score, highestScore);
            lowestScore = Math.min(grade.score, lowestScore);
            scoreSum += grade.score;
            gapNums[(int) (gaps.stream().filter(d -> d < grade.score).count() - 1)]++;
        }

        System.out.println("人数：" + count );
        System.out.println("最高分：" + highestScore);
        System.out.println("最低分：" + lowestScore);
        System.out.println("平均分：" + (scoreSum / count));
        for (int i = 0;i < gapNums.length;i++){
            System.out.println(gaps.get(i) + "~" + gaps.get(i+1)  + "百分比：" + ((gapNums[i] / (double)count)*100) + "%");
        }

    }

    public static void main(String[] args) {
        GradeDict[] gradeArray = new GradeDict[] {
            new  GradeDict("a",89),
            new  GradeDict("b",55),
            new  GradeDict("c",58),
            new  GradeDict("d",70),
            new  GradeDict("e",95)
        };
        processScores(gradeArray,100,50,60,70,80,90);
    }
}
