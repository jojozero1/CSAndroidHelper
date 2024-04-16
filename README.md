# CSAndroidHelper: 一款为Android开发者设计的智能语音助手

## 项目概述

CSAndroidHelper是一款专为Android端打造的智能语音助手，旨在通过语音交互简化日常开发任务，提高工作效率。通过自然语言处理和机器学习技术，CSAndroidHelper能够理解用户的语音指令，并执行相应的操作，如代码生成、问题解答等，支持模板问答。

## 核心特性

- **智能语音识别**：准确识别用户的语音指令，提供流畅的交互体验。
- **全局上下文菜单**：支持从系统菜单中直接唤起，将选中文本添加到输入框。
- **无障碍功能**：通过无障碍功能捕获音量键事件，实现在任意界面唤起助手。
- **图片识别**：支持拍照或从相册上传图片，与GPT Vision模型交互。
- **联网能力**：通过Function接口，在设置中允许GPT发起联网请求，获取网页数据。
- **接入gpt**：本项目支持GPT，在设置中填入OpenAI API_KEY，可以使用openai官网的key来调用，或者是使用代理网站，本项目采用的是 <https://gptgod.online/>网站的api，包括多种大模型。

## 快速开始

要开始使用CSAndroidHelper，请按照以下步骤操作：

1. **安装**：访问项目页面，下载最新发行版中的apk文件并安装。
2. **配置**：这里采用的是gradle8.2版本，如果版本不同可能会报错。需要去https://cloud.baidu.com/doc/SPEECH/s/il9mh8cjb 获取一个百度语音的AppID、API Key、Secret Key。
3. **激活**：开启无障碍模式后长按音量降低键 可启动app，也可在网页中选择一段文字，邮件找到苍山APP，即可对选中内容向苍山进行提问。
4. **使用**：开始使用语音指令进行日常开发任务，例如“将一个冷笑话”或“在京东查找mate 60 价格”。

## 隐私说明
本程序尊重用户隐私，不会以任何方式收集个人信息。所有语音输入和提问均直接发送至OpenAI API，不会经过其他中间服务器。

## 社区和支持

CSAndroidHelper项目欢迎社区的贡献和反馈。如果您在使用过程中遇到任何问题，或者有任何建议和想法，请通过以下方式联系我们：

- **GitHub Issues**：提交问题或建议至[CSAndroidHelper GitHub仓库] (https://github.com/jojozero1/CSAndroidHelper/issues)。
- **讨论区**：加入我们的讨论区，与其他开发者交流心得和最佳实践。

## 许可证

CSAndroidHelper是在[MIT许可证] (https://github.com/jojozero1/CSAndroidHelper/blob/master/LICENSE)下发布的，您可以自由地使用、修改和分发它。

