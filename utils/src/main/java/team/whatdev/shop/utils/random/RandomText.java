package team.whatdev.shop.utils.random;

import java.util.Collections;
import java.util.List;

/**
 * 随机字符串生成<br>
 * 如需关闭数字字符，可在配置文件中进行<br><b>{@code utils.random.number = false}</b><br>
 * 如需关闭大写字母字符，可在配置文件中进行 <br><b>{@code utils.random.up-case = false}</b><br>
 * 如需关闭小写字母字符，可在配置文件中进行<br><b>{@code utils.random.low-case = false}</b><br>
 * 更改内容分别为数组类型进行字符替换<br>
 *     utils.random.numbers、utils.random.upChars、utils.random.lowChars
 * @see team.whatdev.shop.utils.conditional.RandomConditional 查看Boean 控制
 */
public class RandomText {

    private List<String> text;
    private int count;

    /**
     * 取随机字符串，默认为6 位
     * @return
     */
    public String doRandom(){
        return this.doRandom(this.count);
    }

    /**
     * 取随机字符串
     * @param count 取值位数
     * @return
     */
    public String doRandom(int count){
        Collections.shuffle(this.text);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < count){
            sb.append(this.text.get(i));i++;
        }
        return sb.toString().substring(0, count);
    }

    private RandomText(){}
    public RandomText(List<String> list, int count){
        this.text = list;
        this.count = count;
    }

}
