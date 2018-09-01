<template>
  <div>
    <Form :model="libraryInfo" :label-width="150">
      <Row>
        <Col span="12">
          <FormItem label="最小单笔贷款金额">
            <Input v-model="formItem.minSingleLoanAmount"></Input>
          </FormItem>
        </Col>
        <Col span="12">
          <FormItem label="最大单笔贷款金额">
            <Input v-model="formItem.maxSingleLoanAmount"></Input>
          </FormItem>
        </Col>
      </Row>
      <Row>
        <Col span="12">
          <FormItem label="单笔贷款期限类型">
            <Input v-model="formItem.loanTermType"></Input>
          </FormItem>
        </Col>
        <Col span="12">
          <FormItem label="最小单笔贷款期限(数量)">
            <Input v-model="formItem.minSingleLoanTerm"></Input>
          </FormItem>
        </Col>
      </Row>

      <Row>
        <Col span="12">
          <FormItem label="最大单笔贷款期限(数量)">
            <Input v-model="formItem.maxSingleLoanTerm"></Input>
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
  export default {
    data(){
      return {
        formItem:{

      }
      }
    }
  }
</script>
<style>

</style>
