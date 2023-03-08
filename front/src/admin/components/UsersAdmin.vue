<script>
    import { message } from 'ant-design-vue';
    import { SmileOutlined, DownOutlined } from '@ant-design/icons-vue';
    import { defineComponent } from 'vue';
    import axios from "axios";
    const columns = [{
        name: 'id',
        dataIndex: 'id',
        key: 'id',
    }, {
        title: 'Username',
        dataIndex: 'username',
        key: 'username',
    }, {
        title: 'Gender',
        key: 'gender',
        dataIndex: 'gender',
    }, {
        title: 'Address',
        dataIndex: 'addr',
        key: 'addr',
    }, {
        title: 'Action',
        dataIndex: 'action',
        key: 'action',
    }
];
    export default defineComponent({
        components: {
            SmileOutlined,
            DownOutlined,
        },
        data() {
            return {
                tableData: null,
                showTable: false
            }
        },
        methods: {

            getUsers() {
                const HTTP_AXIOS = axios.create();

                HTTP_AXIOS({
                    method: 'get',
                    url: 'http://localhost/users/',
                    data: null,
                    timeout: 1000
                }).then(response => {
                    if (response.data.code === 20041) {
                        this.tableData = response.data.data;
                        this.showTable = true;
                        // console.log(this.tableData);
                        message.success('获取数据成功');
                    } else {
                        tableData = null;
                        message.error('获取数据失败');
                    }
                }).catch(error => {
                    if (error.config.timeout == 10000) {
                        message.error('请求超时，请检查网络')
                    } else {
                        console.log(error);
                        message.error('获取数据失败')
                    }
                })
            }
        },
        setup() {
            return {
                columns,
            };
        },
        mounted() {
            this.getUsers();
        }
    });
</script>
<template>
    <a-button @click="getUsers()">刷新数据</a-button>
    <a-table :columns="columns" :data-source="tableData" v-if="showTable">
        <template #headerCell="{ column }">
            <template v-if="column.key === 'id'">
                <span>
                    <smile-outlined />
                    ID
                </span>
            </template>
        </template>

        <template #bodyCell="{ column, record }">
            <template v-if="column.key === 'name'">
                <a>
                    {{ record.name }}
                </a>
            </template>
            <template v-else-if="column.key === 'tags'">
                <span>
                    <a-tag v-for="tag in record.tags" :key="tag"
                        :color="tag === 'loser' ? 'volcano' : tag.length > 5 ? 'geekblue' : 'green'">
                        {{ tag.toUpperCase() }}
                    </a-tag>
                </span>
            </template>
            <template v-else-if="column.key === 'action'">
                <span>
                    <a>Edit</a>
                    <a-divider type="vertical" />
                    <a>Delete</a>
                    <a-divider type="vertical" />
                    <a class="ant-dropdown-link">
                        More actions
                        <down-outlined />
                    </a>
                </span>
            </template>
        </template>
    </a-table>
</template>