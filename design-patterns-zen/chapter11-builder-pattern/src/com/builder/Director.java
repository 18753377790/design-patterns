package com.builder;

import java.util.ArrayList;

/**
 * @Author 李非凡
 * @Description: 导演类
 * @Date 2020/9/24 17:33
 * @Version 1.0
 */
public class Director {

    /**
     * 执行顺序序列
     */
    private ArrayList<String> sequence = new ArrayList<>();

    /**
     * 奔驰车组装者
     */
    private BenzBuilder benzBuilder = new BenzBuilder();

    /**
     * 宝马车组装者
     */
    private BmwBuilder bmwBuilder = new BmwBuilder();

    /**
     * A类型的奔驰车模型，先start，然后stop，其他什么引擎，喇叭一概没有
     * @return 奔驰模型
     */
    public BenzModel getBenzModelA() {
        // 清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();
        // BenzModelA的执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        // 按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     * B型号的奔驰车模型，是先发动引擎，然后启动，然后停止，没有喇叭
     * @return 奔驰模型
     */
    public BenzModel getBenzModelB() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    /**
     * C型号的宝马车是先按下喇叭（炫耀嘛），然后启动，然后停止
     * @return 宝马模型
     */
    public BmwModel getBmwModelC() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BmwModel) this.bmwBuilder.getCarModel();
    }

    /**
     * D类型的宝马车只有一个功能，就是跑,启动起来就跑，永远不停止
     * @return 宝马模型
     */
    public BmwModel getBmwModelD() {
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return (BmwModel) this.bmwBuilder.getCarModel();
    }
}
