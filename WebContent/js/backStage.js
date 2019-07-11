	//==========侧边栏==============
	$(document).ready(function () {
	  var trigger = $('.hamburger'),
		  overlay = $('.overlay'),
		 isClosed = false;

		trigger.click(function () {
		  hamburger_cross();      
		});
		function hamburger_cross() {

		  if (isClosed == true) {          
			overlay.hide();
			trigger.removeClass('is-open');
			trigger.addClass('is-closed');
			isClosed = false;
		  } else {   
			overlay.show();
			trigger.removeClass('is-closed');
			trigger.addClass('is-open');
			isClosed = true;
		  }
	  }
	  
	  $('[data-toggle="offcanvas"]').click(function () {
			$('#wrapper').toggleClass('toggled');
	  });  
	});
	
	//=============触发弹出框=======
	$(document).ready(function() {
		$("#tst").click(popup);
	});
	
	//=========弹出框===========
	function popup(){
		if(!$('a.close').length){
			var rel = $(this).attr('rel');
			$("#"+rel).fadeIn().css("display", "block");
			$("#"+rel).prepend('<a href="#" class="close">x</a>');
			$('body').on('click', 'a.close', closepopup);
		}
	}
	
	function closepopup(){	
			$('.popup_block').fadeOut(function() {
				$('.popup_block').css("display", "none");
			});
			$('a.close').remove();
	}
	
	$(document).mousemove(function(e) {
		if($('a.close').length){
			var Force = 30;
			var Rotate = 20;
	
			var width = $(document).width();
			var height = $(document).height();
			
			var moveX = (e.pageX - width/2) / (width/2) * -Force;
			var moveY = (e.pageY - height/2) / (height/2) * -Force;
			
			var rotateY = (e.pageX / width * Rotate*2) - Rotate;
			var rotateX = -((e.pageY / height * Rotate*2) - Rotate);
			
			$('.popup_block')
				.css('left', moveX+'px')
				.css('top', moveY+'px')
				.css('transform', 'rotateX('+rotateX+'deg) rotateY('+rotateY+'deg)');
		}
	});
	
	
