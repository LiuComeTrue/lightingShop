/*模拟数据*/
var shopCartdatas = {
	shopcartdatas:[
		{
			"checked":false,
			"src":"../img/singlepro/9.jpg",
			"name":"GZL-中控离心机净化机",
			"supplier":"美国",
			"ConPlace":"中国大陆",
			"price":100,
			"num":1,
			"saveandremove":true,
			"type":"商品",
		},
		{
			"checked":false,
			"src":"img/service4.jpg",
			"name":"GZL-中控离心机净化机",
			"supplier":"美国",
			"ConPlace":"中国大陆",
			"price":100,
			"num":2,
			"saveandremove":true,
			"type":"商品",
		},
		{
			"checked":false,
			"src":"img/service4.jpg",
			"name":"GZL-中控离心机净化机",
			"supplier":"美国",
			"ConPlace":"中国大陆",
			"price":100,
			"num":3,
			"saveandremove":true,
			"type":"服务",
		},
		{
			"checked":false,
			"src":"img/service4.jpg",
			"name":"GZL-中控离心机净化机",
			"supplier":"美国",
			"ConPlace":"中国大陆",
			"price":100,
			"num":4,
			"saveandremove":true,
			"type":"商品",
		},
		{
			"checked":false,
			"src":"img/service4.jpg",
			"name":"GZL-中控离心机净化机",
			"supplier":"美国",
			"ConPlace":"中国大陆",
			"price":600,
			"num":5,
			"saveandremove":true,
			"type":"服务",
		},
	]
}
var addressdatas = {
	addressdata:[
		{
			"name":"吴浩然1",
			"city":"北京市",
			"area":"丰台区",
			"minarea":"嘉园一里9号楼404",
		},
		{
			"name":"吴浩然2",
			"city":"北京市",
			"area":"丰台区",
			"minarea":"嘉园一里9号楼404",
		},
		{
			"name":"吴浩然3",
			"city":"北京市",
			"area":"丰台区",
			"minarea":"嘉园一里9号楼404",
		},
		{
			"name":"吴浩然4",
			"city":"北京市",
			"area":"丰台区",
			"minarea":"嘉园一里9号楼404",
		},
		{
			"name":"吴浩然5",
			"city":"北京市",
			"area":"丰台区",
			"minarea":"嘉园一里9号楼404",
		},
	]
}
var payment = {
	paymentdata:[
		{
			"name":"货到付款",
		},
		{
			"name":"在线支付",
		},
		{
			"name":"银行汇款",
		},
	]
}
var invoice = {
	invoicedata:[
		{
			"name":"不要发票",
		},
		{
			"name":"需要发票",
		},
	]
}
var Coupon = {
	Coupondata:[
		{
			"price":500,
			"time":"2017-08-30",
			"type":"[ 店铺类 ]",
			"types":"[ 店铺类 ]",
		},
		{
			"price":100,
			"time":"2017-08-30",
			"type":"[ 店铺类 ]",
			"types":"[ 店铺类 ]",
		},
		{
			"price":200,
			"time":"2017-08-30",
			"type":"[ 店铺类 ]",
			"types":"[ 店铺类 ]",
		},
	]
}
var deliverymode = {
	deliverymodeData:[
		{
			"type":"自提",
			"name":"选择自提时，请与卖家协商取货地址。",
		},
		{
			"type":"物流",
			"name":"由卖家发货。",
		},
	]
}

var vm = new Vue({
	el: "#myVue",
	data: { 
		/*数据源*/
		 shopTableDatas:[],
		 moreAddressData:addressdatas.addressdata,//地址数据
		 paymentdatas:payment.paymentdata,//支付类型数据
		 deliverymodedatas:deliverymode.deliverymodeData,//配送类型数据
		 invoicedatas:invoice.invoicedata,//发票类型数据
		 Coupondatas:Coupon.Coupondata,//优惠券数据
		 userBuyData:[],//用户购买数据
		
		/*默认选择标签*/
		 checkedAll:false, //全选状态
		 limitNum:3,//默认显示几个地址
		 currentIndex:1,//地址默认选择
		 paymentIndex:1,//支付类型默认选择
		 deliverymodeIndex:1,//配送类型默认选择
		 invoiceIndex:1,//发票类型默认选择
		 CouponIndex:-1,//优惠券默认选择
		 stopDelete:"",//定时器id(用于清空定时器)
		 activeName: '支付平台',
		
		/*关键字段初始化*/
		 moreaddressName:"",//收货人姓名
		 moreaddressCity:"",//收货人所在市
		 moreaddressArea:"",//收货人所在区
		 moreaddressMinarea:"",//收货人所在小区
		 couponPrice:0,//优惠券默认金额
		 goodNums:0,    //商品或者服务总数
		 totalMoney:0, //总价格
		 saveandremove:true,//收藏和取消收藏的状态
		 goodsNum:0,//商品的数量
		 serviceNum:0,//服务的数量
		 
	},
	mounted: function() {
		$.ajax({
            type: "get",
            url: "../myShopCart",
            dataType: "json",
            success: function(data){
                for (x in data) {
                	if (data[x].quantity > data[x].stock)
                		data[x].quantity = data[x].stock;
                }
            	vm.shopTableDatas = data;
            },
            error: function(data){
                console.log("读取myShopCart error!");
            }
        });
	},
	methods: {
		/*商品数量增加减少函数*/
		goodNum:function(item,way){
			if(way == 1){
				if (item.quantity >= item.stock) 
					item.quantity = item.stock;
				else
					item.quantity++;
				vm.countTotalMoney();
			}else{
				if(item.quantity >= 2){
					item.quantity--;
					vm.countTotalMoney();
				}else{
					//item.quantity--;
					//vm.countTotalMoney();
				}
				
			}
		},
		/*单选函数*/
		checkedRadioBtn:function(tabledatas){
			this.countTotalMoney();
			/*单选计算商品或服务数量*/
			if(tabledatas.checked == true){
				this.goodsNum += 1;
			}else{
				console.log("单选未知错误！");
			}
		},
		/*全选函数*/
		checkedAllBtn:function(checkedAll){
			var _this= this;
			/*全选计算商品或服务数量*/
			if(checkedAll == true){
				for(x in this.shopTableDatas){					
					if(this.shopTableDatas[x].stock != 0 ){
						this.shopTableDatas[x].checked = true;
						_this.goodsNum += 1;
					}
				}
			}else{
				for(y in this.shopTableDatas){
					this.shopTableDatas[y].checked = false;
					this.goodsNum = 0;
				}
			}
			vm.countTotalMoney();
		},		
		/*删除单个选中函数*/
		deletegoods:function(index){
			console.log(index);
			var del_data = [];
			del_data.push(this.shopTableDatas[index].lightID);
			this.shopTableDatas.splice(index, 1);			
			deleteLights(del_data);
			vm.countTotalMoney();
		},
		/*删除多个选中函数*/
		deleteSelectAll:function(){
			var del_data = [];
			for(var i = this.shopTableDatas.length-1 ; i >= 0 ; i--){
				if(this.shopTableDatas[i].checked  == true){
					del_data.push(this.shopTableDatas[i].lightID);
					this.shopTableDatas.splice(i, 1);
				}
			}
			deleteLights(del_data);
			vm.countTotalMoney();
		},
		
      /*计算商品总价函数*/
		countTotalMoney:function(){
			var _this = this;
			_this.totalMoney = 0;
			this.shopTableDatas.forEach(function(item,index){
				if(item.checked == true){
					_this.totalMoney += item.quantity*item.price
				}
			})
		},
		/*保存购买数据*/
		saveData:function() {
			if (vm.totalMoney != 0) {
				var selectedData123 = vm.shopTableDatas;
				for(var i = selectedData123.length-1 ; i >= 0 ; i--){
					if(selectedData123[i].checked  == false){
						selectedData123.splice(i, 1);
					}
				}
				$.ajax({
		               type: "post",
		               url: "../order/" + vm.totalMoney,                     
		               data:JSON.stringify(selectedData123),
		               contentType:"application/json;charset=utf-8",
		               dataType: "json", 
		               success: function(data) {
		                   window.location.href='./confirmOrder.html?orderID='+data
		               },
		               error: function(data) {
		                   console.log("结算下订单 error!");
		               }
		         });
				 
			}
			/*var _this = this;
			_this.userBuyData.length = 0;
			this.shopTableDatas.forEach(function(item,index){
				if(item.checked == true){
					var msg={
						msgdata:[
							{
								name:item.name,
								num:item.num,
								price:item.price,
								src:item.src,
							},
						]
					};
					var time=new Date().getTime();	
					localStorage.setItem(time,JSON.stringify(msg));
					window.location.href='../CivilMilitaryIntegration/ShoppingCartAdress.html'
				}
			})*/	
			
			
		},
		/*loadCartAddress:function(){
			this.userBuyData = JSON.parse(localStorage.getItem("user"));  
			console.log(this.userBuyData)
			
			if(localStorage.length!=0){
				
				for(var i=0;i<localStorage.length;i++){
					var key=localStorage.key(i);
					var jsonStr=localStorage.getItem(key);
					this.userBuyData=JSON.parse(jsonStr);
					console.log(this.userBuyData)
				}
			}	
		},*/
		/*提示删除单个商品*/
		alertRadio:function(index){
        	this.$confirm('此操作将永久删除该商品, 是否继续?', '提示', {
          	confirmButtonText: '确定删除',
          	cancelButtonText: '取消',
         	type: 'warning'
       		}).then(() => {
	          	this.$message({
	            type: 'success',
	            message: '删除成功!',
	            callback : vm.deletegoods(index)
	         	});
        	}).catch(() => {
          		this.$message({
           		type: 'warning',
            	message: '已取消删除'
          });          
        });
      },
      /*提示多个删除函数*/
      alertMuch:function(){
        	this.$confirm('此操作将永久删除已选择商品或服务, 是否继续?', '提示', {
          	confirmButtonText: '确定删除',
          	cancelButtonText: '取消',
         	type: 'warning'
       		}).then(() => {
	          	this.$message({
	            type: 'success',
	            message: '删除成功!',
	            callback : vm.deleteSelectAll()
	         	});
        	}).catch(() => {
          		this.$message({
           		type: 'warning',
            	message: '已取消删除'
          });          
        });
      },
     
      /*提示单个商品移动到收藏函数*/
      alertmovesSavegoods:function(index){
        	this.$confirm('此操作将已选择商品或服务移到我的收藏, 是否继续?', '提示', {
          	confirmButtonText: '确定',
          	cancelButtonText: '取消',
         	type: 'warning'
       		}).then(() => {
	          	this.$message({
	            type: 'success',
            	message: '收藏成功!',
	            callback : vm.movesSave(index)
	         	});
        	}).catch(() => {
          		this.$message({
          		type: 'success',
	            message: '收藏成功!',
          });          
        });
      },
      /*提示收藏多个商品函数*/
      alertMuchgoods:function(){
        	this.$confirm('此操作将已选择商品或服务移到我的收藏, 是否继续?', '提示', {
          	confirmButtonText: '确定',
          	cancelButtonText: '取消',
         	type: 'warning'
       		}).then(() => {
	          	this.$message({
	            type: 'success',
            	message: '收藏成功!',
	            callback : vm.saveSelectAll()
	         	});
        	}).catch(() => {
          		this.$message({
          		type: 'success',
	            message: '收藏成功!',
          });          
        });
      }
	},
	/*金额过滤器*/
	filters:{
		moneyFiler:function(value){
			
			return "￥"+value.toFixed(2);
		}
	},
	
});
function deleteLights(listLight) {
	$.ajax({
        type: "DELETE",
        url: "../myShopCart",
        dataType: "json",
        data:JSON.stringify(listLight),
        contentType:"application/json;charset=utf-8",
        success: function(data){
            //alert("删除成功");
        },
        error: function(data){
            console.log("删除myShopCart error!");
        }
    });
}

