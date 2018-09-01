<template>
  <dvi>
    <Form :model="libraryInfo" :label-width="150">
      <Row>
        <Col span="12">
          <FormItem label="授信申请黑名单">
            <Input v-model="formItem.useBlacklistGroupId"></Input>
          </FormItem>
        </Col>
        <Col span="12">
          <FormItem label="授信互斥类型">
            <Select v-model="formItem.applyMutexType">
              <Option value="beijing">所有产品互斥</Option>
              <Option value="shanghai">同类产品互斥</Option>
              <Option value="shenzhen">同产品互斥</Option>
            </Select>
          </FormItem>
        </Col>
      </Row>
      <Row>
        <Col span="12">
          <FormItem label="最小授信额度">
            <Input v-model="formItem.minCreditlLimit"></Input>
          </FormItem>
        </Col>
        <Col span="12">
          <FormItem label="最大授信额度">
            <Input v-model="formItem.maxCreditlLimit"></Input>
          </FormItem>
        </Col>
      </Row>

      <Row>
        <Col span="12">
          <FormItem label="额度有效月数">
            <Input v-model="formItem.limitValidMonths"></Input>
          </FormItem>
        </Col>
        <Col span="12">
          <FormItem label="授信申请最大持续月数">
            <Input v-model="formItem.applyMaxMonthDuration"></Input>
          </FormItem>
        </Col>
      </Row>
      <Row>
        <Col span="12">
          <FormItem label="授信申请拒绝影响天数">
            <Input v-model="formItem.applyMaxDayDuration"></Input>
          </FormItem>
        </Col>
        <Col span="12">
          <FormItem label="授信申请流程配置">
            <Input v-model="formItem.flowJobModleId"></Input>
          </FormItem>
        </Col>
      </Row>

      <FormItem>
        <Button style="margin-left: 30%" type="primary">保存</Button>
        <Button style="margin-left: 16px">取消</Button>

      </FormItem>
    </Form>
  </dvi>
</template>
<script>
  import { getchildProductCreditConfigInfo } from '@/api/data'
export default {
  props:['productId'],
  data(){
    return{
      formItem:{

    },
      productId:this.productId
    }
  },watch: {
    productId:{
      handler(curVal,oldVal){
        getchildProductCreditConfigInfo(curVal).then(res=>{
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
