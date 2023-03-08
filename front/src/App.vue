<template>
    <a-layout style="min-height: 100%;">
        <a-layout-header class="header">
            <div class="logo" />
            <a-menu v-model:selectedKeys="selectedKeys1" theme="dark" mode="horizontal" :style="{ lineHeight: '64px' }">
                <a-menu-item key="1">nav 1</a-menu-item>
                <a-menu-item key="2">nav 2</a-menu-item>
                <a-menu-item key="3">nav 3</a-menu-item>
            </a-menu>
        </a-layout-header>
        <a-row type="flex">
            <a-col :span="24">
                <a-carousel autoplay>
                    <div class="slid-div">
                        <h1>Hello World!</h1>
                        <h2>这里是文字介绍这里是文字介绍这里是文字介绍</h2>
                    </div>
                  </a-carousel>
            </a-col>
          </a-row>
        <a-layout-content style="padding: 0 50px;">

            <a-layout style="padding: 24px 0; background: #fff">
                <a-layout-sider width="200" style="background: #fff">
                    <a-menu v-model:selectedKeys="selectedKeys2" v-model:openKeys="openKeys" mode="inline"
                        style="height: 100%">
                        <a-sub-menu key="sub1">
                            <template #title>
                                <span>
                                    <user-outlined />
                                    subnav 1
                                </span>
                            </template>
                            <a-menu-item key="1">option1</a-menu-item>
                            <a-menu-item key="2">option2</a-menu-item>
                            <a-menu-item key="3">option3</a-menu-item>
                            <a-menu-item key="4">option4</a-menu-item>
                        </a-sub-menu>
                        <a-sub-menu key="sub2">
                            <template #title>
                                <span>
                                    <laptop-outlined />
                                    subnav 2
                                </span>
                            </template>
                            <a-menu-item key="5">option5</a-menu-item>
                            <a-menu-item key="6">option6</a-menu-item>
                            <a-menu-item key="7">option7</a-menu-item>
                            <a-menu-item key="8">option8</a-menu-item>
                        </a-sub-menu>
                        <a-sub-menu key="sub3">
                            <template #title>
                                <span>
                                    <notification-outlined />
                                    subnav 3
                                </span>
                            </template>
                            <a-menu-item key="9">option9</a-menu-item>
                            <a-menu-item key="10">option10</a-menu-item>
                            <a-menu-item key="11">option11</a-menu-item>
                            <a-menu-item key="12">option12</a-menu-item>
                        </a-sub-menu>
                    </a-menu>
                </a-layout-sider>
                <a-layout-content :style="{ padding: '0 24px', minHeight: '280px' }">
                    Content
                </a-layout-content>
            </a-layout>
        </a-layout-content>
        <a-layout-footer style="text-align: center">
            Robot World ©2023 Created by Yeahchen
        </a-layout-footer>
    </a-layout>
</template>
<script>
    import { UserOutlined, LaptopOutlined, NotificationOutlined } from '@ant-design/icons-vue';
    import { defineComponent, ref } from 'vue';
    export default defineComponent({
        components: {
            UserOutlined,
            LaptopOutlined,
            NotificationOutlined,
        },
        setup() {
            return {
                selectedKeys1: ref(['0']),
                selectedKeys2: ref(['1']),
                openKeys: ref(['sub1']),
            };
        },
    });
</script>
<style scoped>
    .logo {
        float: left;
        width: 120px;
        height: 31px;
        margin: 16px 24px 16px 0;
        background: url("https://ts1.cn.mm.bing.net/th/id/R-C.a9b5b9c0f278d1e13f3e637d398c779f?rik=cITEYE2dIYPukA&riu=http%3a%2f%2flofrev.net%2fwp-content%2fphotos%2f2017%2f04%2firobot_logo_download.png&ehk=MDMkDh4MApTnze6SVmUNZsG1QWqXJSONHadYLzpAOp4%3d&risl=&pid=ImgRaw&r=0");
        background-size: 100%;
        background-repeat: no-repeat;
    }

    .ant-row-rtl .logo {
        float: right;
        margin: 16px 0 16px 24px;
    }

    .site-layout-background {
        background: #fff;
    }


    /* For demo */
    .ant-carousel :deep(.slick-slide) {
        height: 420px;
        /* background-image: url("https://img.alicdn.com/tfs/TB1pldBkmR26e4jSZFEXXbwuXXa-3840-1000.png"); */
        background-image: url("https://qcloudimg.tencent-cloud.cn/trisys/assets/product/images/q3vSxKKbollWFKT0OLE0D.jpg");
        background-size:cover;
        overflow: hidden;
        text-align: left;
        line-height: 32px;
    }

    .ant-carousel :deep(.slick-slide h3) {
        color: #fff;
    }
    .slid-div{
        margin-top: 130px;
        margin-left: 320px;
    }
    .slid-div h1{
        font-size: 52px;
    }
    .slid-div h2{
        font-size: 20px;
    }
</style>