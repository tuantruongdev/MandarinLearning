package com.example.mandarinlearning.utils;

import androidx.annotation.NonNull;

/**
 * Created by macos on 12,August,2022
 */
public interface Const {
    enum Levels {
        NEWBIE("Newbie"),
        ELEMENTARY("Elementary"),
        INTERMEDIATE("Intermediate"),
        UPPER_INTERMEDIATE("Upper-Intermediate");
        private String value;

        Levels(String value) {
            this.value = value;
        }

        @NonNull
        @Override
        public String toString() {
            return value;
        }
    }

    interface Auth {
        int MINIMUM_PASSWORD_LENGTH = 6;
        String NO_USERNAME_OR_PASSWORD = "Email or password can't empty!";
        String PASSWORD_LESS_THAN_MINIMUM = "Password should be at least 6 characters";
        String EMAIL_REGEX = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        String EMAIL_VALIDATE_FAILED = "Please enter a valid email";
    }

    interface Api {
        String REPLACE_CHARACTER = "{hanzi}";
        String REPLACE_LEVEL = "{level}";
        String BASE_URL = "https://pinyin-word-api.vercel.app/api";
        String AUDIO_QUERY = "/audio/" + REPLACE_CHARACTER;
        String SEGMENT_QUERY = "/segment";
        //body: { text: string }
        String EXTERNAL_LINK_QUERY = "/links/" + REPLACE_CHARACTER;
        String LOOKUP_QUERY = "/lookup/" + REPLACE_CHARACTER;
        String SENTENCES_QUERY = "/sentences/" + REPLACE_CHARACTER + "?&level=" + REPLACE_LEVEL + "&includeAudio=1";
//        String NEWBIE = "Newbie";
//        String ELEMENTARY = "Elementary";
//        String INTERMEDIATE = "Intermediate";
//        String UPPER_INTERMEDIATE = "Upper-Intermediate";
        //Newbie, Elementary, Intermediate, Upper-Intermediate
    }

    interface Screen {
        String DETAIL_CHARACTER = "Dictionary for ";
        int DICTIONARY_SCREEN = 0;
        int QUIZ_SCREEN = 1;
        int FAVORITE_SCREEN = 2;
        int ACCOUNT_SCREEN = 3;
    }

    interface IntentKey {
        String WORD_LOOKUP = "wordLookup";
        String HSK_LEVEL = "hskLevel";
        String QUESTION_COUNT = "questionCount";
        String SPLIT_CHARACTER = "@";
        String REMOVING_SAVED = "removeSaved";
    }

    interface Database {
        String FIREBASE_URL ="https://madarinlearning-a03b2-default-rtdb.asia-southeast1.firebasedatabase.app/";
        String DB_NAME = "default_user";
        int UNLOADED_CHARACTER = -1;
        int UNLOADED_CHARACTER_HSK = -2;
    }

    interface Quiz {
        int QUIZ_5 = 5;
        int QUIZ_10 = 10;
        int Quiz_15 = 15;

        interface HSK {
            int HSK_1 = 1;
            int HSK_2 = 2;
            int HSK_3 = 3;
            int HSK_4 = 4;
            int HSK_5 = 5;
            int HSK_6 = 6;
        }
    }

    interface HskData {
        String HSK_1 = "爱 八 爸 杯 本 不 菜 茶 车 吃 打 大 的 点 电 店 都 读 对 多 儿 二 饭 飞 分 高 个 工 国 果 汉 好 号 喝 和 很 后 话 回 会 机 几 家 见 叫 她 姐 今 九 觉 开 看 客 块 来 老 冷 里 了 六 妈 吗 买 么 没 们 米 面 名 明 哪 那 呢 能 你 年 女 朋 七 气 前 钱 请 去 热 人 认 三 商 上 少 生 师 十 什 时 识 视 是 书 谁 水 睡 说 四 岁 他 太 天 听 同 我 五 午 下 先 现 想 小 校 些 写 谢 学 样 一 衣 医 椅 影 友 有 雨 语 院 月 再 在 怎 这 中 钟 住 桌 子 字 昨 作 坐 做";
        String HSK_2 = "吧 白 百 班 帮 报 比 笔 边 便 表 别 病 步 长 常 场 唱 出 穿 床 次 从 错 但 到 道 得 等 弟 第 懂 动 房 非 告 哥 歌 给 公 共 狗 瓜 贵 过 孩 黑 红 欢 还 火 鸡 间 件 教 近 进 经 就 考 可 课 快 乐 累 离 两 路 卖 慢 忙 猫 每 妹 门 奶 男 您 牛 旁 跑 票 起 汽 千 情 晴 球 然 让 日 肉 色 身 事 试 室 手 司 思 送 诉 虽 所 它 题 体 跳 外 完 玩 晚 往 为 问 洗 笑 新 姓 休 雪 眼 羊 药 要 也 已 以 意 因 阴 泳 游 右 鱼 员 远 运 早 站 找 真 正 知 纸 助 着 走 最 左";
        String HSK_3 = "阿 啊 安 把 般 搬 板 办 半 包 饱 北 备 被 必 变 宾 冰 才 参 草 层 查 差 超 衬 成 城 迟 除 楚 船 春 词 聪 答 带 单 担 蛋 当 灯 地 典 调 定 东 冬 短 段 朵 饿 而 耳 发 法 方 放 风 夫 服 附 复 该 干 感 刚 根 跟 更 故 顾 刮 怪 关 馆 惯 害 河 候 乎 护 花 化 画 坏 环 换 黄 婚 或 绩 级 极 急 己 记 季 加 检 简 健 讲 角 脚 较 接 街 节 结 解 介 界 借 斤 京 睛 净 境 静 久 酒 旧 居 句 据 决 卡 康 渴 刻 空 口 哭 裤 筷 蓝 篮 礼 李 理 力 历 脸 练 亮 辆 聊 料 邻 留 楼 旅 绿 马 满 冒 帽 末 目 拿 南 难 脑 鸟 努 爬 怕 盘 胖 皮 片 漂 平 妻 期 其 奇 骑 且 轻 清 秋 求 趣 容 如 赛 伞 扫 山 衫 烧 绍 声 实 史 始 世 市 瘦 叔 舒 束 树 数 刷 双 算 特 疼 梯 踢 提 甜 条 铁 头 突 图 腿 万 网 忘 望 位 喂 文 闻 舞 务 物 西 希 息 习 喜 戏 系 夏 鲜 相 香 箱 响 向 像 鞋 心 信 兴 星 行 熊 须 需 选 牙 颜 阳 爷 业 宜 议 易 音 银 饮 应 迎 用 邮 又 于 育 遇 元 园 愿 越 澡 择 张 丈 照 者 直 只 终 种 重 周 主 注 准 自 总 租 足 嘴";
        String HSK_4 = "矮 按 案 败 扮 棒 保 抱 倍 笨 鼻 毕 遍 标 饼 并 播 部 擦 猜 材 彩 餐 厕 察 尝 诚 乘 程 持 抽 处 传 窗 此 粗 存 袋 戴 弹 刀 导 倒 登 低 底 掉 丢 堵 肚 度 断 锻 队 烦 反 肥 费 份 奋 丰 封 否 肤 符 福 父 付 负 富 改 赶 敢 钢 糕 格 各 功 供 购 够 估 挂 观 管 光 广 逛 规 海 寒 汗 航 合 何 盒 贺 厚 呼 虎 互 户 划 怀 悔 活 货 获 积 基 激 及 即 计 纪 技 际 既 寄 价 假 坚 减 建 江 将 奖 降 交 郊 饺 巾 金 仅 紧 尽 禁 惊 精 景 警 竞 竟 镜 究 局 举 拒 具 剧 距 聚 绝 科 棵 克 肯 苦 款 况 困 拉 辣 懒 浪 厉 丽 利 励 俩 连 怜 联 炼 凉 谅 量 列 林 零 龄 另 流 律 虑 乱 论 落 麻 码 漫 毛 美 梦 迷 密 免 秒 民 命 母 内 耐 恼 闹 弄 暖 排 牌 判 陪 批 啤 篇 骗 聘 评 瓶 泼 破 普 弃 签 歉 敲 桥 巧 切 亲 琴 穷 区 取 全 泉 缺 却 确 裙 扰 任 扔 仍 入 散 森 沙 伤 稍 勺 社 申 深 甚 省 剩 失 使 士 示 式 适 释 收 首 受 售 授 输 暑 术 帅 顺 死 松 速 酸 随 孙 台 抬 态 谈 汤 糖 躺 趟 讨 填 厅 停 挺 通 童 桶 推 脱 碗 危 微 围 卫 味 温 无 误 吸 惜 细 咸 险 线 详 象 消 效 辛 醒 幸 性 修 羞 秀 许 压 呀 亚 烟 严 言 研 盐 演 厌 验 扬 洋 养 叶 页 姨 疑 忆 艺 引 印 赢 永 勇 优 尤 由 油 愉 与 羽 预 原 约 阅 云 允 杂 咱 暂 脏 则 责 增 展 占 章 招 折 针 争 整 证 之 支 汁 值 职 植 止 址 指 至 质 众 洲 祝 著 专 转 赚 仔 资 族 座";
        String HSK_5 = "岸 暗 傲 巴 摆 拜 版 伴 傍 宝 悲 贝 背 辈 币 闭 避 编 辩 兵 博 补 财 采 藏 操 册 测 叉 拆 产 肠 厂 抄 朝 潮 吵 炒 尘 沉 称 趁 承 池 尺 充 冲 虫 愁 丑 臭 初 厨 础 触 创 吹 纯 辞 刺 匆 促 催 脆 村 达 呆 代 待 贷 旦 淡 挡 岛 德 敌 递 钓 顶 订 冻 洞 斗 抖 豆 毒 独 吨 蹲 顿 躲 恶 尔 乏 罚 翻 繁 返 泛 范 防 仿 访 废 纷 疯 佛 扶 幅 府 辅 腐 妇 傅 盖 概 纲 搞 革 隔 贡 沟 构 古 股 骨 鼓 固 拐 官 冠 归 柜 滚 哈 含 喊 豪 核 恨 衡 忽 华 滑 缓 幻 慌 灰 恢 挥 汇 伙 击 迹 集 辑 籍 挤 济 继 夹 甲 驾 架 艰 兼 荐 渐 践 键 骄 阶 戒 届 劲 敬 救 巨 俱 捐 卷 军 均 俊 靠 恐 控 库 夸 宽 狂 矿 亏 扩 括 拦 览 烂 朗 劳 雷 泪 类 梨 立 例 恋 链 良 粮 疗 劣 烈 临 灵 领 令 龙 陆 录 率 略 轮 络 骂 贸 貌 媒 秘 蜜 苗 妙 敏 摸 模 摩 陌 漠 默 某 木 幕 慕 纳 念 娘 宁 农 浓 欧 偶 拍 派 盼 炮 培 配 碰 披 匹 拼 品 凭 婆 迫 齐 棋 企 启 器 浅 欠 枪 强 墙 抢 悄 勤 青 庆 趋 圈 权 拳 劝 群 燃 染 绕 忍 荣 柔 软 润 弱 洒 杀 傻 晒 删 闪 扇 善 赏 尚 舍 设 射 摄 伸 神 升 胜 诗 施 湿 石 食 驶 势 饰 柿 守 寿 殊 蔬 熟 述 税 硕 丝 私 似 搜 俗 肃 素 宿 塑 损 缩 索 锁 坦 逃 套 替 挑 贴 庭 统 痛 偷 投 透 途 土 团 退 托 歪 弯 王 威 违 唯 伟 尾 委 未 胃 谓 稳 卧 握 污 屋 武 勿 雾 析 悉 席 吓 厦 闲 显 县 限 羡 献 乡 享 项 销 孝 胁 欣 形 型 兄 雄 虚 序 叙 绪 续 宣 血 寻 旬 询 训 迅 押 延 艳 腰 邀 摇 咬 夜 依 移 遗 乙 义 亿 译 益 谊 姻 英 营 映 硬 拥 犹 幼 余 娱 玉 域 寓 豫 圆 源 怨 跃 匀 孕 晕 灾 载 赞 糟 造 曾 炸 窄 粘 战 涨 掌 账 召 哲 珍 诊 阵 振 震 征 挣 政 织 志 制 治 致 智 置 猪 竹 逐 属 筑 抓 装 状 撞 追 咨 紫 综 阻 组 醉 尊 遵";
        String HSK_6 = "哀 挨 癌 碍 昂 熬 奥 扒 疤 拔 坝 罢 霸 掰 颁 斑 拌 瓣 绑 榜 膀 磅 胞 堡 暴 爆 卑 碑 奔 崩 甭 蹦 逼 彼 鄙 辟 弊 蔽 壁 臂 鞭 贬 扁 辨 憋 滨 濒 丙 拨 波 剥 脖 伯 驳 泊 勃 舶 搏 薄 哺 捕 布 怖 裁 踩 残 惭 惨 灿 仓 沧 苍 舱 糙 侧 策 插 岔 柴 馋 缠 阐 颤 昌 偿 敞 畅 倡 钞 巢 嘲 扯 彻 撤 臣 辰 陈 晨 闯 撑 呈 惩 驰 侈 齿 耻 斥 赤 翅 崇 宠 仇 绸 畴 稠 筹 酬 储 川 喘 串 垂 锤 唇 蠢 瓷 慈 磁 雌 丛 凑 醋 窜 摧 粹 寸 磋 挫 措 搭 歹 逮 耽 胆 诞 党 荡 档 捣 蹈 悼 盗 稻 瞪 堤 滴 抵 帝 缔 颠 垫 惦 淀 奠 殿 雕 吊 跌 谍 叠 丁 叮 盯 钉 董 栋 陡 逗 督 赌 睹 妒 杜 渡 端 堆 兑 盾 夺 堕 惰 额 恩 伐 帆 番 凡 犯 贩 妨 肪 纺 沸 肺 氛 坟 粉 愤 峰 锋 蜂 逢 缝 讽 奉 伏 俘 浮 辐 抚 俯 咐 赴 副 赋 腹 覆 丐 钙 甘 杆 岗 港 杠 膏 稿 鸽 割 搁 耕 攻 宫 恭 躬 巩 勾 钩 姑 孤 辜 谷 雇 乖 贯 灌 罐 轨 鬼 跪 棍 锅 裹 涵 罕 旱 憾 毫 耗 痕 狠 恒 横 轰 哄 烘 宏 洪 喉 猴 吼 胡 壶 湖 糊 猾 唤 患 痪 荒 皇 煌 恍 晃 谎 辉 讳 绘 惠 毁 慧 昏 荤 浑 魂 混 祸 惑 霍 讥 饥 肌 缉 吉 疾 嫉 忌 剂 寂 佳 嘉 嫁 尖 肩 监 煎 拣 俭 柬 捡 剪 剑 舰 溅 鉴 箭 僵 疆 酱 娇 浇 胶 椒 焦 侥 狡 搅 缴 皆 揭 劫 杰 洁 捷 截 竭 诫 津 谨 锦 晋 浸 晶 兢 井 阱 颈 径 纠 舅 拘 鞠 桔 沮 矩 惧 倦 倔 掘 君 菌 峻 慨 刊 勘 堪 侃 砍 慷 扛 抗 烤 颗 壳 咳 恳 坑 孔 扣 枯 酷 挎 跨 筐 旷 框 眶 愧 溃 馈 昆 捆 阔 啦 蜡 赖 栏 滥 郎 狼 廊 捞 牢 姥 蕾 愣 厘 黎 隶 粒 帘 廉 梁 晾 辽 猎 裂 淋 赁 凌 铃 溜 浏 瘤 笼 聋 隆 垄 拢 搂 陋 漏 炉 鲁 露 滤 侣 屡 履 掠 伦 逻 嘛 埋 迈 麦 脉 蛮 馒 瞒 芒 盲 茫 矛 茂 枚 眉 煤 霉 魅 闷 盟 猛 蒙 弥 谜 泌 觅 眠 棉 勉 描 瞄 庙 灭 蔑 鸣 铭 谬 膜 磨 魔 抹 沫 莫 寞 墨 谋 沐 牧 墓 奈 嫩 泥 拟 逆 腻 酿 捏 拧 凝 扭 纽 奴 怒 虐 挪 诺 殴 呕 趴 攀 叛 畔 庞 抛 袍 泡 赔 沛 佩 喷 盆 烹 蓬 篷 膨 捧 劈 疲 脾 屁 僻 偏 飘 贫 频 屏 坡 颇 魄 剖 扑 铺 朴 谱 曝 戚 欺 漆 歧 旗 乞 岂 迄 泣 恰 洽 迁 牵 铅 谦 潜 遣 谴 腔 侨 瞧 窍 翘 怯 窃 侵 钦 禽 寝 倾 擎 丘 曲 驱 屈 渠 娶 犬 券 雀 嚷 壤 饶 惹 仁 韧 饪 绒 溶 融 揉 乳 辱 锐 若 撒 塞 桑 嗓 丧 骚 嫂 涩 刹 啥 筛 擅 捎 哨 奢 舌 蛇 涉 呻 绅 审 渗 慎 绳 圣 盛 尸 狮 拾 蚀 氏 逝 誓 兽 抒 梳 疏 署 鼠 竖 墅 耍 衰 摔 甩 霜 爽 瞬 斯 撕 寺 饲 肆 讼 诵 颂 艘 苏 碎 隧 塌 塔 踏 胎 汰 泰 贪 摊 滩 瘫 坛 毯 叹 探 碳 唐 堂 塘 倘 烫 涛 掏 滔 桃 陶 淘 腾 剔 屉 涕 惕 添 田 亭 艇 铜 筒 秃 徒 涂 吐 兔 吞 拖 妥 拓 娃 挖 瓦 袜 湾 丸 顽 挽 亡 枉 妄 旺 维 伪 纬 萎 畏 蔚 慰 纹 吻 窝 沃 乌 诬 伍 侮 悟 晤 夕 昔 晰 稀 溪 熄 膝 袭 媳 隙 瞎 侠 峡 狭 辖 霞 仙 纤 掀 弦 贤 衔 嫌 宪 陷 馅 厢 祥 翔 巷 橡 削 宵 潇 晓 肖 啸 歇 协 斜 谐 携 泄 泻 卸 屑 械 薪 衅 腥 刑 凶 汹 胸 朽 绣 袖 锈 墟 畜 嗅 蓄 喧 悬 旋 炫 穴 熏 巡 循 讯 逊 鸦 鸭 崖 哑 雅 讶 咽 淹 岩 沿 炎 掩 宴 焰 央 仰 氧 痒 肴 谣 遥 耀 野 液 仪 亦 异 役 抑 绎 疫 裔 毅 翼 吟 隐 瘾 婴 盈 颖 佣 庸 涌 踊 忧 幽 悠 诱 予 渔 愚 舆 宇 屿 吁 郁 狱 浴 欲 喻 御 裕 愈 誉 冤 援 缘 岳 悦 酝 熨 蕴 砸 栽 宰 攒 葬 遭 皂 噪 燥 躁 泽 贼 赠 渣 扎 眨 诈 榨 摘 宅 债 沾 瞻 斩 崭 彰 仗 帐 杖 胀 障 沼 兆 罩 遮 侦 枕 镇 睁 蒸 郑 症 枝 肢 脂 执 侄 殖 旨 帜 挚 秩 掷 滞 稚 忠 衷 肿 州 舟 粥 宙 昼 皱 骤 株 珠 诸 烛 拄 煮 嘱 瞩 驻 柱 铸 砖 妆 庄 壮 幢 椎 坠 缀 卓 拙 捉 浊 琢 姿 滋 宗 棕 踪 纵 奏 揍 祖 钻 罪";
    }
}
