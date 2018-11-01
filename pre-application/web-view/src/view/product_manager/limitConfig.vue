<template>
  <div>
    <Form :model="formItem" :label-width="150">
      <Row>
        <Col span="12">
          <FormItem label="名称">
            <Input v-model="formItem.productId"></Input>
          </FormItem>
        </Col>
        <Col span="12">
          <FormItem label="用途">
            <Select v-model="formItem.type">
              <Option value="beijing">取现</Option>
              <Option value="shanghai">消费</Option>
              <Option value="shenzhen">特殊</Option>
            </Select>
          </FormItem>
        </Col>
      </Row>
      <Row>
        <Col span="12">
          <FormItem label="占比">
            <Select v-model="formItem.ratio">
              <Option value="beijing">10%</Option>
              <Option value="shanghai">20%</Option>
              <Option value="shenzhen">50%</Option>
              <Option value="shenzhen">100%</Option>
            </Select>
          </FormItem>
        </Col>
        <Col span="12">
          <FormItem label="风险等级">
            <Select v-model="formItem.riskLevel">
              <Option value="beijing">A</Option>
              <Option value="shanghai">B</Option>
              <Option value="shenzhen">C</Option>
            </Select>
          </FormItem>
        </Col>
      </Row>

      <Row>
        <Col span="12">
          <FormItem label="是否关联客户基础额度">
            <i-switch v-model="formItem.linkCustomerBaseCreditlimit" size="large">
              <span slot="open">On</span>
              <span slot="close">Off</span>
            </i-switch>
          </FormItem>
        </Col>
        <Col span="12">
          <FormItem label="是否循环额度">
            <i-switch v-model="formItem.loopCreditlimit" size="large">
              <span slot="open">On</span>
              <span slot="close">Off</span>
            </i-switch>
          </FormItem>
        </Col>
      </Row>
      <Row>
        <Col span="12">
          <FormItem label="是否提高额度">
            <i-switch v-model="formItem.increaseCreditlimit" size="large">
              <span slot="open">On</span>
              <span slot="close">Off</span>
            </i-switch>
          </FormItem>
        </Col>
        <Col span="12">
          <FormItem label="是否降低额度">
            <i-switch v-model="formItem.decreaseCreditlimit" size="large">
              <span slot="open">On</span>
              <span slot="close">Off</span>
            </i-switch>
          </FormItem>
        </Col>
      </Row>

      <FormItem>
          <Button style="margin-left: 30%" type="primary">保存</Button>
          <Button style="margin-left: 16px">取消</Button>

      </FormItem>
    </Form>
  </div>
</template>
<script>
  import { getchildProductLimitConfigInfo } from '@/api/data'
  export default {
    props:['productId'],
    data(){
      return {
        formItem:{
          linkCustomerBaseCreditlimit:false,
          loopCreditlimit:false,
          increaseCreditlimit:true,
          decreaseCreditlimit:false,
          productId:"JLD",
          riskLevel:"",
          ratio:"",
          type:""

        }
      }
    },watch: {
      productId:{
        handler(curVal,oldVal){
          getchildProductLimitConfigInfo(curVal).then(res=>{
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
