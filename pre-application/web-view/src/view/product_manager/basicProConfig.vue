<template>
  <div>

    <Form :model="formItem" :label-width="150">
      <Row>
      <Col span="12">
        <FormItem label="产品编号">
          <Input v-model="formItem.productId"></Input>
        </FormItem>
      </Col>
      <Col span="12">
        <FormItem label="产品名称">
          <Input v-model="formItem.name"></Input>
        </FormItem>
      </Col>
    </Row>
      <Row>
        <Col span="12">
          <FormItem label="产品类型">
            <Select v-model="formItem.typeId">
              <Option value="beijing">1</Option>
              <Option value="shanghai">2</Option>
              <Option value="shenzhen">3</Option>
              <Option value="shenzhen">4</Option>
            </Select>
          </FormItem>
        </Col>
        <Col span="12">
          <FormItem label="产品优先级">
            <Select v-model="formItem.priority">
              <Option value="beijing">1</Option>
              <Option value="shanghai">2</Option>
              <Option value="shenzhen">3</Option>
              <Option value="shenzhen">4</Option>
            </Select>
          </FormItem>
        </Col>
      </Row>
      <Row>
        <Col span="12">
          <FormItem label="过期日期">
            <DatePicker type="date" placeholder="Select date" v-model="formItem.expireDate"></DatePicker>
          </FormItem>

        </Col>
        <Col span="12">
          <FormItem label="生效日期">
            <DatePicker type="date" placeholder="Select date" v-model="formItem.effectiveDate"></DatePicker>
          </FormItem>
        </Col>
      </Row>
      <Row>
        <Col span="12">
          <FormItem label="是否有效">
            <i-switch v-model="formItem.effective" size="large">
              <span slot="open">On</span>
              <span slot="close">Off</span>
            </i-switch>
          </FormItem>
        </Col>

      </Row>
      <Row>
      <FormItem label="产品客群描述">
        <Input v-model="formItem.textarea" type="textarea" :autosize="{minRows: 2,maxRows: 5}" placeholder="Enter something..."></Input>
      </FormItem>
      </Row>
      <FormItem>
        <Button style="margin-left: 30%" type="primary">保存</Button>
        <Button style="margin-left: 16px">取消</Button>
      </FormItem>
    </Form>
  </div>
</template>
<script>
  import { getchildProductBasicInfo } from '@/api/data'
  export default {
    name: 'BasicProConfig',
    props:['productId'],
    data() {
      return {
        formItem: {
          priority:"",
          typeId:"",
          productId:"",
          name:"",
          expireDate:"",
          effectiveDate:"",
          effective:true
        },
        productId:this.productId
      }
    },
    updated: function (){

    },methods:{

    },watch: {
      productId:{
        handler(curVal,oldVal){
          getchildProductBasicInfo(curVal).then(res=>{
            this.formItem = res.data.item
          }).error(err=>{

          })
        },
        deep: true,
      }
    }
  }
</script>
<style>

</style>
